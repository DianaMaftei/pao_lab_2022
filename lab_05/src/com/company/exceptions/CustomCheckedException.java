package com.company.exceptions;

public class CustomCheckedException extends Exception{

    public CustomCheckedException(String message) {
        super(message);
    }

    public CustomCheckedException(String message, Throwable cause) {
        super(message, cause);
    }
}
