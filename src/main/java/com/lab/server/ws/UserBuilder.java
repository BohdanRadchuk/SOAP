package com.lab.server.ws;

import com.lab.server.User;

import java.math.BigInteger;

public class UserBuilder {
    private String name;
    private BigInteger age;
    private boolean gender;

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setAge(BigInteger age) {
        this.age = age;
        return this;
    }

    public UserBuilder setGender(boolean gender) {
        this.gender = gender;
        return this;
    }

    public User createUser() {
        User user = new User();
        user.setName(this.name);
        user.setAge(this.age);
        user.setGender(this.gender);
        return user;
    }
}