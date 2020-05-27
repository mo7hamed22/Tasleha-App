package com.example.android.singnin.Model;

public class LoginResponse {
    private boolean error;
    private String message;
    private UserLogin user;

    public LoginResponse(boolean error, String message, UserLogin user) {
        this.error = error;
        this.message = message;
        this.user = user;
    }

    public boolean isError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public UserLogin getUser() {
        return user;
    }
}