package com.bobocode;

import com.bobocode.configs.ApplicationConfigs;
import com.bobocode.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectsExamples {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfigs.class);
        UserService userService = context.getBean(UserService.class);

        userService.findAllUsers().forEach(System.out::println);
    }
}
