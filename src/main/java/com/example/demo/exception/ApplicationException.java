package com.example.demo.exception;


public class ApplicationException extends RuntimeException {

    private static final String MESSAGE = "app exception";

    public ApplicationException() {
        super(MESSAGE);
    }

    public ApplicationException(String message) {
        super(message);
    }
}
