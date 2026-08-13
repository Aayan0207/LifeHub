package com.aayan.lifehub.exception.auth;

public class EmailRequiredException extends RuntimeException {
    public EmailRequiredException() {
        super("Email field is blank.");
    }
}
