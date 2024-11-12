package ru.app;

import ru.app.notifications.NotificationService;
import ru.app.subscribers.Subscriber;
import ru.app.publishers.Publisher;
import ru.app.users.User;

public class Main {
    public static void main(String[] args) {
        User alice = new User("Alice");
        User kate = new User("Kate");
        User alex = new User("Alex");

        kate.addSubscriber(message -> System.out.println("Kate received notification: " + message));

        alex.addSubscriber(message -> System.out.println("Alex received notification: " + message));

        alice.addSubscriber(message -> System.out.println("Alice received notification: " + message));

        NotificationService notificationService = new NotificationService();

        Publisher publisherAlice = new Publisher(alice, notificationService);
        Publisher publisherKate = new Publisher(kate, notificationService);
        Publisher publisherAlex = new Publisher(alex, notificationService);

        publisherAlice.publishPost("Hello, everyone!");
        publisherKate.likePost("Alice's post");
        publisherAlex.commentOnPost("Kate's post");
    }
}