package com.bobocode;


import com.bobocode.configs.MainConfigs;
import com.bobocode.service.TalkingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanOverridingExample {
    private static TalkingService talkingService;

    public static void main(String[] args) {
        init();
        System.out.println(talkingService.saySomething());
    }

    private static void init() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfigs.class);
        talkingService = context.getBean(TalkingService.class);
    }
}
