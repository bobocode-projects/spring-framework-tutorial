package com.bobocode.service.impl;

import com.bobocode.model.User;
import com.bobocode.service.UserService;
import com.bobocode.util.TestDataGenerator;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;


@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> findAllUsers() {
        return IntStream.rangeClosed(1, 10)
                .mapToObj(i -> TestDataGenerator.getnerateUserWithAddressAndRoles())
                .collect(toList());
    }

    @Override
    public User findByEmail(String email) {
        User user = TestDataGenerator.getnerateUserWithAddressAndRoles();
        user.getCredentials().setEmail(email);
        return user;
    }
}

