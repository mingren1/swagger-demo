package com.athome.swagger.swaggerdemo.beans;

import java.io.Serializable;

public class ResObject implements Serializable {

    private int status;
    private String message;

    public ResObject(int status, String message) {
        this.status = status;
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResObject{" +
                "status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
