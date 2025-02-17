package com.example.Social.Media.Platform.proxy;

import java.util.Set;

public class RealProfile implements ProfileAccess {
    private String owner;
    private Set<String> friends;
    public RealProfile(String owner, Set<String> friends) {
        this.owner = owner;
        this.friends = friends;
    }
    public void viewProfile(String viewer) {
        if(friends.contains(viewer)) {
            System.out.println(viewer + " is viewing " + owner + "'s profile.");
        } else {
            System.out.println("Access denied to " + viewer);
        }
    }
}
