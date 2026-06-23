package com.example.api.exceptions;

public class DuplicatePhoneException extends RuntimeException{
    public DuplicatePhoneException(String message){
        super(message);
    }
}
