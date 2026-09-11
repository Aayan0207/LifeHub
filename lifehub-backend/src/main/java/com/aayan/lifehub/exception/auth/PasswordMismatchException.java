package com.aayan.lifehub.exception.auth;
import static com.aayan.lifehub.common.ErrorMessages.PASSWORD_MISMATCH_EXCEPTION;

public class PasswordMismatchException extends RuntimeException{
    public PasswordMismatchException(){
        super(PASSWORD_MISMATCH_EXCEPTION);
    }

    public String getField(){
        return "confirmPassword";
    }
}
