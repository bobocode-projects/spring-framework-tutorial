package com.bobocode.configs;

import com.bobocode.service.AccountService;
import com.bobocode.service.impl.AccountServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfigs {
    @Bean
    public AccountService accountService() {
        return new AccountServiceImpl();
    }
}
