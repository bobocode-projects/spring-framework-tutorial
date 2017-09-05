package com.bobocode.controller;

import com.bobocode.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.IntStream;

import static com.bobocode.util.TestDataGenerator.getnerateUserWithAddressAndRoles;
import static java.util.stream.Collectors.toList;

@Controller
@RequestMapping("/users")
public class UserController {
    public static int DEFAULT_USER_COUNT = 10;

    @GetMapping("/{count}")
    public String generateUserList(@PathVariable int count, Model model) {
        List<User> userList = IntStream.range(1, count)
                .mapToObj(i -> getnerateUserWithAddressAndRoles())
                .collect(toList());

        model.addAttribute(userList);
        return "users";
    }

    @GetMapping
    public String generateUserList(Model model) {
        return generateUserList(DEFAULT_USER_COUNT, model);
    }

}
