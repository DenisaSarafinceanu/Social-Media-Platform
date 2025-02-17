package com.example.Social.Media.Platform.notifications;

// Sigleton Pattern
// Prints a welcome notification for user.
public class NotificationSystem {
    private static NotificationSystem instance;
    private NotificationSystem() {}
    public static NotificationSystem getInstance(){
        if (instance == null) {
            instance = new NotificationSystem();
        }
        return instance;
    }
    public void notifyUser(String user, String message) {
        System.out.println("Notification to " + user + ": " + message);
    }
}
