package com.aayan.lifehub.exception.auth;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(){
        super("User not found.");
    }
}
