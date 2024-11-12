package ru.app.publishers;

import ru.app.notifications.NotificationService;
import ru.app.users.User;

public class Publisher {
    private User user;
    private NotificationService notificationService;

    public Publisher(User user, NotificationService notificationService) {
        this.user = user;
        this.notificationService = notificationService;
    }

    public void publishPost(String postContent) {
        notificationService.notifySubscribers(user, "published a new post: " + postContent);
    }

    public void commentOnPost(String commentContent) {
        notificationService.notifySubscribers(user, "commented on a post: " + commentContent);
    }

    public void likePost(String likedPost) {
        notificationService.notifySubscribers(user, "liked a post: " + likedPost);
    }
}