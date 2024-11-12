package ru.app.builders;

import ru.app.entities.User;

public interface IUserBuilder {
    IUserBuilder withFirstName(String firstName);
    IUserBuilder withLastName(String lastName);
    IUserBuilder withEmail(String email);
    IUserBuilder withAge (String age);
    User build();
}