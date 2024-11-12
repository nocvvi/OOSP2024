package ru.app.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ru.app.database.DatabaseConnectionManager;

public class UserService {

    private final DatabaseConnectionManager connectionManager;

    public UserService(DatabaseConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }

    public void saveUser(String userData) throws SQLException {
        Connection connection = connectionManager.connectToDatabase(
                "jdbc:mysql://localhost:3306/dboosp",
                "user",
                "pass"
        );

        System.out.println("Подключение установлено!");
        String sql = "INSERT INTO users (name) VALUES (?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, userData);

        int rowsAffected = statement.executeUpdate();
        System.out.printf("Добавлено %d строк%n", rowsAffected);

        statement.close();
        connection.close();
    }
}