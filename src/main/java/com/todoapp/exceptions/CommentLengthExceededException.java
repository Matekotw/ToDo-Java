package com.todoapp.exceptions;

public class CommentLengthExceededException extends Exception {
    public CommentLengthExceededException(String message) {
        super(message);
    }
}
