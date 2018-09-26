package com.bobocode;


import com.bobocode.configs.ApplicationConfigs;
import com.bobocode.dao.AccountDao;
import com.bobocode.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Application context that is built using annotation based configuration.
 * <p>
 * In this example we are requesting {@link AccountService} bean from Spring context. This bean has a dependency
 * {@link AccountDao}, which is injected by Spring container. It shows typical Spring Dependency Injection container work.
 * It builds application context (creates beans) according to the configurations, on the other hand it injects the beans
 * where it is requested.
 */
public class DependencyInjectionExample {
    private static AccountService accountService;

    public static void main(String[] args) {
        init();
        accountService.findOldestClient().ifPresent(System.out::println);
    }

    private static void init(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfigs.class);
        accountService = context.getBean(AccountService.class);
    }
}
