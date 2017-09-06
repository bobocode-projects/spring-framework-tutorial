package com.bobocode.web.controller;

import com.bobocode.model.User;
import com.bobocode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserRestController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User get(@PathVariable Long id){
        return userService.findById(id);
    }

    @PostMapping
    public void postUser(@RequestBody User user){
        userService.save(user);
    }

    @PutMapping
    public void updateUser(@RequestBody User user){
        userService.save(user);
    }

    @DeleteMapping("/{id}")
    public void removeUser(@PathVariable Long id){
        User user = userService.findById(id);
        userService.remove(user);
    }
}
