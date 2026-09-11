package com.aayan.lifehub.dto.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import static com.aayan.lifehub.common.ErrorMessages.*;

public class LoginRequest {
    @NotBlank(message = PASSWORD_REQUIRED_EXCEPTION)
    private String password;
    @NotBlank(message = EMAIL_REQUIRED_EXCEPTION)
    @Email
    private String email;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
