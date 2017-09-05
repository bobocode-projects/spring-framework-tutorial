package com.bobocode.service.impl;


import com.bobocode.exception.EntityNotFoundException;
import com.bobocode.model.User;
import com.bobocode.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static com.bobocode.util.TestDataGenerator.generateUserList;
import static java.util.stream.Collectors.toMap;

@Service
public class UserServiceImpl implements UserService {

    private Map<Long, User> userMap = new HashMap<>();

    @PostConstruct
    private void init() {
        userMap = generateUserList(20).stream()
                .collect(toMap(User::getId, Function.identity()));
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(userMap.values());
    }

    @Override
    public void save(User user) {
        if (user.getId() == null) {
            long id = userMap.size() + 1;
            user.setId(id);
            userMap.put(id, user);
        } else {
            userMap.put(user.getId(), user);
        }
    }

    @Override
    public User findById(Long id) {
        User user = userMap.get(id);
        if (user == null) {
            throw new EntityNotFoundException("User not found by id=" + id);
        } else {
            return user;
        }
    }

    @Override
    public void remove(User user) {
        if (user.getId() != null) {
            userMap.remove(user.getId());
        }
    }


}
