package com.aayan.lifehub.dto.auth;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import static com.aayan.lifehub.common.ErrorMessages.*;

public class RegisterRequest {
    @NotBlank(message = USERNAME_REQUIRED_EXCEPTION)
    private String name;
    @NotBlank(message = EMAIL_REQUIRED_EXCEPTION)
    @Email(message = INVALID_EMAIL_FORMAT_EXCEPTION)
    private String email;
    @NotBlank(message = PASSWORD_REQUIRED_EXCEPTION)
    private String password;
    @NotBlank(message = CONFIRM_PASSWORD_REQUIRED_EXCEPTION)
    private String confirmPassword;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }
}
