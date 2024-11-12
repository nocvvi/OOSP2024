package ru.app;

import ru.app.builders.IUserBuilder;
import ru.app.builders.UserBuilder;
import ru.app.entities.User;

public class Main {
    public static void main(String[] args) {
        User user = new UserBuilder()
                .withFirstName("Иван")
                .withLastName("Иванов")
                .withEmail("ivanov@mail.ru")
                .withAge("20")
                .build();
        User user1 = new UserBuilder()
                .withLastName("Васичкин")
                .withFirstName("Андрей")
                .withEmail("andro@inbox.ru")
                .withAge("22")
                .build();

        System.out.println(user);
        System.out.println(user1);
    }
}