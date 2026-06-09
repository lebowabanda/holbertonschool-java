package exceptions;

public class InvalidAuthorException extends Exception {
    public InvalidAuthorException(String message) {
        super(message);
    }
}