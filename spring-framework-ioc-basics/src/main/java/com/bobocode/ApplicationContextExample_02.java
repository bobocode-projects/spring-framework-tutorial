package com.bobocode;


import com.bobocode.dao.AccountDao;
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
        AccountDao accountDao = context.getBean(AccountDao.class);

        accountDao.getAllAccounts().stream().map(Account::getEmail).forEach(System.out::println);

    }
}
