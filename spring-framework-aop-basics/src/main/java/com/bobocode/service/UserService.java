package com.bobocode.service;

import com.bobocode.model.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();
    User findByEmail(String email);
}
