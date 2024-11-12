package ru.app.users;

import java.util.ArrayList;
import java.util.List;
import ru.app.subscribers.Subscriber;

public class User {
    private String username;
    private List<Subscriber> subscribers;

    public User(String username) {
        this.username = username;
        this.subscribers = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }
}