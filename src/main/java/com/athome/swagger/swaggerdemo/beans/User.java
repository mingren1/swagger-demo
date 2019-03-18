package com.athome.swagger.swaggerdemo.beans;

import java.io.Serializable;

public class User implements Serializable {

    private String name;
    private int age;
    private char sex;

    public User() {

    }

    public User(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
