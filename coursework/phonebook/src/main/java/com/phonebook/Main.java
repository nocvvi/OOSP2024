package com.phonebook;

import com.phonebook.repository.ContactRepository;
import com.phonebook.server.PhoneBookServer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ContactRepository repository = new ContactRepository();

        repository.addContact("Дима", "123456789", "dima@example.com");
        repository.addContact("Макс", "987654321", "max@example.com");

        PhoneBookServer server = new PhoneBookServer(repository);
        try {
            server.start();
        } catch (IOException e) {
            System.err.println("Ошибка запуска сервера: " + e.getMessage());
        }
    }
}
