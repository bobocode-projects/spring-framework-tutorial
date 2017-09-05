package com.bobocode.service;

import com.bobocode.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void save(User user);

    User findById(Long id);

    void remove(User user);
}
