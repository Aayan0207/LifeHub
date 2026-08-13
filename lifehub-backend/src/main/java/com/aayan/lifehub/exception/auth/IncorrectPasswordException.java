package com.aayan.lifehub.exception.auth;

public class IncorrectPasswordException extends RuntimeException{
    public IncorrectPasswordException(){
        super("Password is incorrect.");
    }
}
