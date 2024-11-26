package com.phonebook.server;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.phonebook.model.Contact;
import com.phonebook.repository.ContactRepository;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.util.Optional;

public class PhoneBookServer {
    private final ContactRepository repository;
    private final ObjectMapper objectMapper = new ObjectMapper();

    public PhoneBookServer(ContactRepository repository) {
        this.repository = repository;
    }

    public void start() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/contacts", new ContactHandler());
        server.createContext("/", new StaticFileHandler("public"));

        server.setExecutor(null);
        server.start();

        System.out.println("Сервер запущен на порту 8080");
    }

    private class ContactHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            logRequest(exchange);
            addCorsHeaders(exchange);

            String method = exchange.getRequestMethod();
            switch (method) {
                case "GET" -> handleGet(exchange);
                case "POST" -> handlePost(exchange);
                case "DELETE" -> handleDelete(exchange);
                default -> sendJsonResponse(exchange, 405, new ErrorResponse("Метод не поддерживается"));
            }
        }

        private void handleGet(HttpExchange exchange) throws IOException {
            sendJsonResponse(exchange, 200, repository.getAllContacts());
        }

        private void handlePost(HttpExchange exchange) throws IOException {
            try {
                Contact contact = objectMapper.readValue(exchange.getRequestBody(), Contact.class);
                Contact newContact = repository.addContact(contact.getName(), contact.getPhone(), contact.getEmail());
                sendJsonResponse(exchange, 201, newContact);
            } catch (Exception e) {
                sendJsonResponse(exchange, 400, new ErrorResponse("Неверные данные для добавления контакта"));
            }
        }

        private void handleDelete(HttpExchange exchange) throws IOException {
            String path = exchange.getRequestURI().getPath();
            String[] segments = path.split("/");
            if (segments.length < 3) {
                sendJsonResponse(exchange, 400, new ErrorResponse("Укажите ID контакта для удаления"));
                return;
            }

            try {
                int id = Integer.parseInt(segments[2]);
                boolean deleted = repository.deleteContact(id);
                if (deleted) {
                    sendJsonResponse(exchange, 200, new SuccessResponse("Контакт с ID " + id + " удален"));
                } else {
                    sendJsonResponse(exchange, 404, new ErrorResponse("Контакт с ID " + id + " не найден"));
                }
            } catch (NumberFormatException e) {
                sendJsonResponse(exchange, 400, new ErrorResponse("Некорректный ID контакта"));
            }
        }

        private void sendJsonResponse(HttpExchange exchange, int statusCode, Object response) throws IOException {
            String jsonResponse = objectMapper.writeValueAsString(response);
            exchange.getResponseHeaders().add("Content-Type", "application/json");
            exchange.sendResponseHeaders(statusCode, jsonResponse.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(jsonResponse.getBytes());
            os.close();
        }

        private void addCorsHeaders(HttpExchange exchange) {
            exchange.getResponseHeaders().add("Access-Control-Allow-Origin", "*");
            exchange.getResponseHeaders().add("Access-Control-Allow-Methods", "GET, POST, DELETE, OPTIONS");
            exchange.getResponseHeaders().add("Access-Control-Allow-Headers", "Content-Type");
        }

        private void logRequest(HttpExchange exchange) {
            System.out.println("[" + exchange.getRequestMethod() + "] " + exchange.getRequestURI());
        }
    }

    private class StaticFileHandler implements HttpHandler {
        private final String baseDir;

        public StaticFileHandler(String baseDir) {
            this.baseDir = baseDir;
        }

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String path = exchange.getRequestURI().getPath();
            if (path.equals("/")) {
                path = "/index.html";
            }

            File file = new File(baseDir + path).getCanonicalFile();


            if (!file.getPath().startsWith(new File(baseDir).getCanonicalPath()) || !file.exists()) {
                exchange.sendResponseHeaders(404, -1); // 404 Not Found
                return;
            }

            String mime = Files.probeContentType(file.toPath());
            if (mime != null) {
                exchange.getResponseHeaders().add("Content-Type", mime);
            }

            byte[] fileBytes = Files.readAllBytes(file.toPath());
            exchange.sendResponseHeaders(200, fileBytes.length);

            try (OutputStream os = exchange.getResponseBody()) {
                os.write(fileBytes);
            }
        }
    }

    private static class ErrorResponse {
        private final String error;

        public ErrorResponse(String error) {
            this.error = error;
        }

        public String getError() {
            return error;
        }
    }

    private static class SuccessResponse {
        private final String message;

        public SuccessResponse(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
