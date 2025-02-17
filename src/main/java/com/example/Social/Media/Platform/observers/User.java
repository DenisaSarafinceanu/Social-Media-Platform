package com.example.Social.Media.Platform.observers;

import com.example.Social.Media.Platform.mediators.ChatMediator;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private ChatMediator mediator;
    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
    public void sendMessage(String message) {
        System.out.println(name + " sends: " + message);
        mediator.sendMessage(message, this);
    }
    public void receiveMessage(String message) {
        System.out.println(name + " received: " + message);
    }
}
