package com.aayan.lifehub.dto.auth;

import com.aayan.lifehub.model.auth.User;

public class LoginResponse {
    private String email;
    private String username;
    private String status;
    private String token;

    public LoginResponse(User user, String status, String token) {
        this.email = user.getEmail();
        this.username = user.getName();
        this.status = status;
        this.token = token;
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

    public String getToken() {
        return token;
    }
}
