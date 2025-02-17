package com.example.Social.Media.Platform.mediators;

import com.example.Social.Media.Platform.observers.User;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ChatMediator {
    private List<User> users = new ArrayList<>();
    public void addUser(User user) {
        users.add(user);
    }
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receiveMessage(message);
            }
        }
    }

}
