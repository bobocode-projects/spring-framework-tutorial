package com.bobocode.service;

import com.bobocode.dao.AccountDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    private final AccountDao accountDao;

    public AccountService(@Qualifier("fakeAccountDao") AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void printAllAccounts() {
        accountDao.findAll().forEach(System.out::println);
    }
}
