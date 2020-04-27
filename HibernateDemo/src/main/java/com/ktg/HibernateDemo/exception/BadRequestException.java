package com.ktg.HibernateDemo.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;


@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {
    private Object data;

    public BadRequestException() {

    }

    public BadRequestException(String message) {
        super(message);
    }

    public BadRequestException(Object data, String message) {
        super(message);
        this.data = data;
    }

    public BadRequestException(Throwable cause) {
        super(cause);
    }

    public BadRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

