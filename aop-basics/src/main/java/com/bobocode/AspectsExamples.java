package com.bobocode;

import com.bobocode.configs.ApplicationConfigs;
import com.bobocode.model.User;
import com.bobocode.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AspectsExamples {
    private static UserService userService;

    public static void main(String[] args) {
        init();
        List<User> users = userService.findAllUsers();
        User user = userService.findByEmail("test@gmail.com");

        System.out.printf("All users: %s%n", users);
        System.out.printf("User found by email:%s%n", user);
    }

    private static void init() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfigs.class);
        userService = context.getBean(UserService.class);
    }
}
