package com.example.Social.Media.Platform;

import com.example.Social.Media.Platform.decorators.HashtagDecorator;
import com.example.Social.Media.Platform.iterations.PostIterator;
import com.example.Social.Media.Platform.mediators.ChatMediator;
import com.example.Social.Media.Platform.mementos.DraftMemento;
import com.example.Social.Media.Platform.mementos.PostEditor;
import com.example.Social.Media.Platform.notifications.NotificationSystem;
import com.example.Social.Media.Platform.observers.Follower;
import com.example.Social.Media.Platform.observers.User;
import com.example.Social.Media.Platform.proxy.ProfileAccess;
import com.example.Social.Media.Platform.proxy.RealProfile;
import com.example.Social.Media.Platform.stategies.FeedSortingStrategy;
import com.example.Social.Media.Platform.stategies.LatestFirst;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class SocialMediaPlatformApplication {

	public static void main(String[] args) {
		// Singleton Notification
		NotificationSystem.getInstance().notifyUser("Jane", "Welcome to Social Media!");

		// Decorator for Posts
		HashtagDecorator post = new HashtagDecorator("Hello World");
		System.out.println("Post with Hashtag: " + post.getContent());

		// Proxy for Profile Access
		Set<String> friends = new HashSet<>(Arrays.asList("Marie", "Ana"));
		ProfileAccess profile = new RealProfile("Jane", friends);
		profile.viewProfile("Marie");
		profile.viewProfile("Carrie");

		// Mediator for Group Chat
		ChatMediator chatMediator = new ChatMediator();
		User marie = new User("Marie", chatMediator);
		User ana = new User("Ana", chatMediator);
		User jane = new User("Jane", chatMediator);
		chatMediator.addUser(marie);
		chatMediator.addUser(ana);
		chatMediator.addUser(jane);
		jane.sendMessage("Hello everyone!");

	}


}
