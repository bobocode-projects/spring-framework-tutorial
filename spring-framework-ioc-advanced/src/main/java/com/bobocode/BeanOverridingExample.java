package com.bobocode;


import com.bobocode.configs.MainConfigs;
import com.bobocode.service.TalkingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanOverridingExample {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfigs.class);

        TalkingService talkingService = context.getBean(TalkingService.class);
        System.out.println(talkingService.saySomething());
    }
}
