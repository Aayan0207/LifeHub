package com.aayan.lifehub.exception;


import com.aayan.lifehub.dto.HubErrorResponse;
import com.aayan.lifehub.exception.auth.EmailAlreadyExistsException;
import com.aayan.lifehub.exception.auth.IncorrectPasswordException;
import com.aayan.lifehub.exception.auth.PasswordMismatchException;
import com.aayan.lifehub.exception.auth.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public HubErrorResponse handleValidationError(MethodArgumentNotValidException exception) {
        Map<String, String> errors = new HashMap<>();
        exception.getFieldErrors().forEach(error -> {
            String field = error.getField();
            String message = error.getDefaultMessage();
            errors.put(field, message);
        });
        return new HubErrorResponse(errors);
    }

    @ExceptionHandler(PasswordMismatchException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public HubErrorResponse handlePasswordMismatchError(PasswordMismatchException exception) {
        Map<String, String> errors = new HashMap<>();
        String field = exception.getField();
        String message = exception.getMessage();
        errors.put(field, message);
        return new HubErrorResponse(errors);
    }

    @ExceptionHandler(EmailAlreadyExistsException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public HubErrorResponse handleEmailExistsError(EmailAlreadyExistsException exception){
        Map<String,String> errors = new HashMap<>();
        String field = exception.getField();
        String message = exception.getMessage();
        errors.put(field,message);
        return new HubErrorResponse(errors);
    }

    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public HubErrorResponse handleUserNotFoundError(UserNotFoundException exception){
        Map<String,String> errors = new HashMap<>();
        String field = exception.getField();
        String message = exception.getMessage();
        errors.put(field,message);
        return new HubErrorResponse(errors);
    }

    @ExceptionHandler(IncorrectPasswordException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public HubErrorResponse handlePasswordError(IncorrectPasswordException exception){
        Map<String,String> errors = new HashMap<>();
        String field = exception.getField();
        String message = exception.getMessage();
        errors.put(field,message);
        return new HubErrorResponse(errors);
    }
}
