package com.bobocode;

import com.bobocode.configs.ApplicationConfigs;
import com.bobocode.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectsExamples {
    private static UserService userService;

    public static void main(String[] args) {
        init();
        userService.findAllUsers().forEach(System.out::println);
    }

    private static void init() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfigs.class);
        userService = context.getBean(UserService.class);
    }
}
