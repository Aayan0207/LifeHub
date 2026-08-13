package com.aayan.lifehub.dto.auth;

import com.aayan.lifehub.model.auth.User;

public class LoginResponse {
    private String email;
    private String username;
    private String status;

    public LoginResponse(User user, String status) {
        this.email = user.getEmail();
        this.username = user.getName();
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getStatus() {
        return status;
    }
}
