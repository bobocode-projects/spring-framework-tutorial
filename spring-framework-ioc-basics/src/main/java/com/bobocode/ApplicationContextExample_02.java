package com.bobocode;


import com.bobocode.model.Account;
import com.bobocode.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Application context that is built using XML configuration.
 */
public class ApplicationContextExample_02 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        AccountService accountService = context.getBean(AccountService.class);

        accountService.getAllAccounts().stream().map(Account::getEmail).forEach(System.out::println);

    }
}
