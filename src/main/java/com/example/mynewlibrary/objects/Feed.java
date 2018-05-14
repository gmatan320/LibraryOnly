package com.example.mynewlibrary.objects;

public class Feed {
    String username;
    String tweet;

    public Feed(String username, String tweet) {
        this.username = username;
        this.tweet = tweet;
    }


    public String getUsername() {
        return this.username;
    }

    public String getTweet() {
        return this.tweet;
    }

}
