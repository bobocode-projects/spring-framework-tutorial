package com.bobocode;

import com.bobocode.congfig.RootConfig;
import com.bobocode.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AdvancedBeanExample {
    private static AccountService accountService;

    public static void main(String[] args) {
        init();
        accountService.printAllAccounts();
    }

    private static void init() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RootConfig.class);
        accountService = applicationContext.getBean(AccountService.class);
    }
}
