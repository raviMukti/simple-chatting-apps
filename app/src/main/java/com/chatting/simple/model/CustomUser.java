package com.chatting.simple.model;

public class CustomUser {
    private String userId;
    private String userName;
    private String userProfile;

    public CustomUser(String userId, String userName, String userProfile) {
        this.userId = userId;
        this.userName = userName;
        this.userProfile = userProfile;
    }

    public CustomUser() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(String userProfile) {
        this.userProfile = userProfile;
    }
}
