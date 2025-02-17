package com.example.Social.Media.Platform.stategies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LatestFirst implements FeedSortingStrategy{
    public List<String> sort(List<String> posts) {
        List<String> sorted = new ArrayList<>(posts);
        Collections.reverse(sorted);
        return sorted;
    }
}
