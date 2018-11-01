package com.lab.server.ws;

import com.lab.server.User;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class UserRepository {

    private static final List<User> users = new ArrayList<>();
    private UserBuilder builder = new UserBuilder();
    public UserRepository() {
        initData();
    }

    private void initData() {
       users.add(builder.setName("Vasya")
                       .setGender(true)
                       .setAge(BigInteger.valueOf(22))
                       .createUser()
                       );
       users.add(builder.setName("Olya")
               .setGender(false)
               .setAge(BigInteger.valueOf(44))
               .createUser()
       );
    }

    public User findUser(String name) {

        return users.stream().filter(user -> user.getName().equals(name.trim()))
                .findAny().orElseThrow(NoSuchElementException::new);
    }
}
