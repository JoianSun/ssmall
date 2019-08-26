package com.echo.exception;

/**
 * @author joians
 * createTime: 2019-08-26 19:55:13
 */
public class SSMCustomException extends Exception {
    private String message;

    public SSMCustomException() {
    }

    public SSMCustomException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SSMCustomException{" +
                "message='" + message + '\'' +
                '}';
    }
}
