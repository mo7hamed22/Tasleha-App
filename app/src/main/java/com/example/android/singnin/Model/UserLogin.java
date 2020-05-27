package com.example.android.singnin.Model;

public class UserLogin {
    private int id;
    private String email, name;

    public UserLogin(int id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }


}