package com.aayan.lifehub.dto.auth;

import com.aayan.lifehub.model.auth.User;

public class RegisterResponse {
    private String id;
    private String name;
    private String email;

    public RegisterResponse(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
