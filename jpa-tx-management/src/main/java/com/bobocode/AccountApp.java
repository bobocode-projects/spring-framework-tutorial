package com.bobocode;

import com.bobocode.config.RootConfig;
import com.bobocode.model.Account;
import com.bobocode.service.AccountService;
import com.bobocode.util.TestDataGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.util.List;

/**
 * This this code snipped shows Spring Transaction Manager with JPA example
 */
public class AccountApp {
    private static AccountService accountService;

    public static void main(String[] args) {
        init();
        accountService.printAllAccounts();
        accountService.withdraw(1L, BigDecimal.valueOf(1000));
        accountService.printAllAccounts();
    }

    private static void init() {
        ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
        accountService = context.getBean(AccountService.class);
        List<Account> accountList = TestDataGenerator.getAccountList(5);
        accountList.forEach(accountService::save);
    }
}
