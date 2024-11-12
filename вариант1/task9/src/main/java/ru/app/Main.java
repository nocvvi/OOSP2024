package ru.app;

import java.sql.SQLException;

import ru.app.database.DatabaseConnectionManager;
import ru.app.service.UserService;

public class Main {

    public static void main(String[] args) {
        DatabaseConnectionManager manager = DatabaseConnectionManager.getInstance();
        UserService service = new UserService(manager);

        try {
            service.saveUser("Dima Alehin");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}