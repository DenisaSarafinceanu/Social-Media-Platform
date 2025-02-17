package com.example.Social.Media.Platform.stategies;

// Displays posts in reverse chronological order.

import java.util.List;

public interface FeedSortingStrategy {
    List<String> sort(List<String> posts);
}
