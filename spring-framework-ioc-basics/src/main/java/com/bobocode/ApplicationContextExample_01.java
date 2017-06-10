package com.bobocode;


import com.bobocode.configs.ApplicationConfigs;
import com.bobocode.model.Account;
import com.bobocode.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Application context that is built using annotation based configuration.
 */
public class ApplicationContextExample_01 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfigs.class);
        AccountService accountService = context.getBean(AccountService.class);

        accountService.getAllAccounts().stream().map(Account::getEmail).forEach(System.out::println);

    }
}
