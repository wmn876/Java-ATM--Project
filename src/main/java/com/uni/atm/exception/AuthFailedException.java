package com.uni.atm.exception;

public class AuthFailedException extends RuntimeException {

    public AuthFailedException(String message) {
        super(message);
    }

    
}