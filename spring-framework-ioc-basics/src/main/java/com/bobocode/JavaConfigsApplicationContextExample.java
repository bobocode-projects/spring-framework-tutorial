package com.bobocode;


import com.bobocode.configs.ApplicationConfigs;
import com.bobocode.dao.AccountDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Application context that is built using annotation based configuration.
 */
public class JavaConfigsApplicationContextExample {
    private static AccountDao accountDao;

    public static void main(String[] args) {
        init();
        accountDao.getAllAccounts().forEach(System.out::println);
    }

    private static void init() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfigs.class);
        accountDao = context.getBean(AccountDao.class);
    }
}
