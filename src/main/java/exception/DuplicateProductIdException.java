package main.java.exception;

public class DuplicateProductIdException extends Exception {
    public DuplicateProductIdException(String message) {
        super(message);
    }
}
