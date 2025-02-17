package com.example.Social.Media.Platform.iterations;

// Iterates through and prints each post.

import java.util.Iterator;
import java.util.List;

public class PostIterator implements Iterator<String> {
    private List<String> posts;
    private int position = 0;
    public PostIterator(List<String> posts){
        this.posts = posts;
    }
    public boolean hasNext() {
        return position < posts.size();
    }
    public String next() {
        return posts.get(position++);
    }
}
