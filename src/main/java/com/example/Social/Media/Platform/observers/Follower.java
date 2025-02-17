package com.example.Social.Media.Platform.observers;

// Observer
// Each follower of the user will receive notifications for each post of the user.
public class Follower implements Observer{
    private String name;
    public Follower(String name) {
        this.name = name;
    }
    public void update(String post) {
        System.out.println(name + " received update: " + post);
    }
}
