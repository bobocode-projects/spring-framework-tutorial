package com.bobocode;


import com.bobocode.configs.ApplicationConfigs;
import com.bobocode.dao.AccountDao;
import com.bobocode.model.Account;
import com.bobocode.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;

import static java.time.Period.between;
import static java.util.stream.Collectors.toMap;

/**
 * Application context that is built using annotation based configuration.
 * <p>
 * In this example we are requesting {@link AccountService} bean from Spring context. This bean has a dependency
 * {@link AccountDao}, which is injected by Spring container. It shows typical Spring Dependency Injection container work.
 * It builds application context (creates beans) according to the configurations, on the other hand it injects the beans
 * where it is requested.
 */
public class ApplicationContextExample_03 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfigs.class);
        AccountService accountService = context.getBean(AccountService.class);

        Account oldestClient = accountService.findOldestClient();

        System.out.println(oldestClient.getFirstName() + " "
                + oldestClient.getLastName()
                + ", age " + between(oldestClient.getBirthday(), LocalDate.now()).getYears());
    }
}
