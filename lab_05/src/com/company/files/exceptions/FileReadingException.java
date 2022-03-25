package com.company.files.exceptions;

public class FileReadingException extends Exception {

    public FileReadingException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileReadingException(String message) {
        super(message);
    }
}
