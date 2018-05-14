package com.example.mynewlibrary.objects;

public class User {
    String username;
    Boolean isFollow;
    public User(String username, Boolean isFollow) {
        this.username = username;
        this.isFollow = isFollow;
    }

    public String getUsername() {
        return this.username;
    }

    public Boolean getIsFollow() {
        return this.isFollow;
    }

    public void setIsFollow(Boolean isFollow) {
        this.isFollow = isFollow;
    }
}
