package com.aayan.lifehub.exception.auth;

public class UsernameRequiredException extends RuntimeException{
    public UsernameRequiredException(){
        super("Username field is blank.");
    }
}
