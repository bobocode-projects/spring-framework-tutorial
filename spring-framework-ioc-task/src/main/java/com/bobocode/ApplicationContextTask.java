package com.bobocode;

import com.bobocode.configs.AppContextTaskConfig;
import com.bobocode.service.StringConsumerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * This task is about configuring application context. Your job is mostly find and add a proper Spring annotation.

 * If the configuration is complete and correct this main method will print "H E L L O" to the console.
 */
public class ApplicationContextTask {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppContextTaskConfig.class);
        StringConsumerService consumerService = applicationContext.getBean(StringConsumerService.class);
        consumerService.consume("Hello");
    }
}
