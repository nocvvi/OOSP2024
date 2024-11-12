package ru.app.builders;

import ru.app.entities.User;

public class UserBuilder implements IUserBuilder {
    private String firstName;
    private String lastName;
    private String email;
    private String age;

    @Override
    public IUserBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public IUserBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public IUserBuilder withEmail(String email) {
        this.email = email;
        return this;
    }
    @Override
    public IUserBuilder withAge (String age){
        this.age = age;
        return this;
    }

    @Override
    public User build() {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setAge(age);
        return user;
    }
}