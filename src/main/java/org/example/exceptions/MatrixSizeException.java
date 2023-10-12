package org.example.exceptions;

public class MatrixSizeException extends Exception {
    public MatrixSizeException() {
        super();
    }

    public MatrixSizeException(String message) {
        super(message);
    }
}
