package com.bobocode;


import com.bobocode.dao.AccountDao;
import com.bobocode.model.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Application context that is built using XML configuration.
 */
public class XmlConfigsApplicationContextExample {
    private static AccountDao accountDao;

    public static void main(String[] args) {
        init();
        accountDao.getAllAccounts().forEach(System.out::println);
    }

    private static void init(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        accountDao = context.getBean(AccountDao.class);
    }
}
