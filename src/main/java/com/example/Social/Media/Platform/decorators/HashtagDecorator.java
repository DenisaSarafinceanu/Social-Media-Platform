package com.example.Social.Media.Platform.decorators;

public class HashtagDecorator extends PostDecorator {
    private String content;
    public HashtagDecorator(String content) {
        this.content = content;
    }
    public String getContent() {
        return content + " #socialmedia";
    }
}
