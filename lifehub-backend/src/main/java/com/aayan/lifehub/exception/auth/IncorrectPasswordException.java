package com.aayan.lifehub.exception.auth;

import static com.aayan.lifehub.common.ErrorMessages.INCORRECT_PASSWORD_EXCEPTION;

public class IncorrectPasswordException extends RuntimeException{
    public IncorrectPasswordException(){
        super(INCORRECT_PASSWORD_EXCEPTION);
    }
    public String getField(){
        return "password";
    }
}
