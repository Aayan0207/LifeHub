package com.aayan.lifehub.dto.auth;

public class LoginRequest {
    private String name;
    private String password;
    private String email;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
