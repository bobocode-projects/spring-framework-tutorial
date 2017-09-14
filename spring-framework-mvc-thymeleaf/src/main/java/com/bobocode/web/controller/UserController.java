package com.bobocode.web.controller;

import com.bobocode.model.User;
import com.bobocode.util.TestDataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    public static int DEFAULT_USER_COUNT = 10;

    @GetMapping("/{count}")
    public String generateUserList(@PathVariable int count, Model model) {

        List<User> userList = TestDataGenerator.generateUserList(count);

        model.addAttribute("userList", userList);
        return "users";
    }

    @GetMapping
    public String generateUserList(Model model) {
        return generateUserList(DEFAULT_USER_COUNT, model);
    }

}
