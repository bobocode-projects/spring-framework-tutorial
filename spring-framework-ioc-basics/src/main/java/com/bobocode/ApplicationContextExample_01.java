package com.bobocode;


import com.bobocode.configs.ApplicationConfigs;
import com.bobocode.dao.AccountDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Application context that is built using annotation based configuration.
 */
public class ApplicationContextExample_01 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfigs.class);
        AccountDao accountDao = context.getBean(AccountDao.class);

        accountDao.getAllAccounts().forEach(System.out::println);
    }
}
