package com.aayan.lifehub.exception.auth;

import static com.aayan.lifehub.common.ErrorMessages.USER_NOT_FOUND_EXCEPTION;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(){
        super(USER_NOT_FOUND_EXCEPTION);
    }
    public String getField(){
        return "email";
    }
}
