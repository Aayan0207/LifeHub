package com.aayan.lifehub.exception.auth;

public class PasswordMismatchException extends RuntimeException{
    public PasswordMismatchException(){
        super("Password and Confirm Password do not match.");
    }
}
