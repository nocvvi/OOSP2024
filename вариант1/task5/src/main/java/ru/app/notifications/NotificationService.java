package ru.app.notifications;

import ru.app.subscribers.Subscriber;
import ru.app.users.User;

import java.util.List;

public class NotificationService {
    public void notifySubscribers(User user, String action) {
        List<Subscriber> subscribers = user.getSubscribers();
        for (Subscriber subscriber : subscribers) {
            subscriber.receiveNotification(action);
        }
    }
}