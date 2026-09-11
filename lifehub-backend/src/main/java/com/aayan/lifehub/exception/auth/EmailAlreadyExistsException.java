package com.aayan.lifehub.exception.auth;

import static com.aayan.lifehub.common.ErrorMessages.EMAIL_ALREADY_TAKEN_EXCEPTION;

public class EmailAlreadyExistsException extends RuntimeException {
    public EmailAlreadyExistsException() {
        super(EMAIL_ALREADY_TAKEN_EXCEPTION);
    }
    public String getField(){
        return "email";
    }
}
