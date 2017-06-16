package com.bobocode.service.impl;

import com.bobocode.dao.AccountDao;
import com.bobocode.model.Account;
import com.bobocode.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static java.util.Comparator.comparing;

@Component
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public Account findOldestClient() {
        return accountDao.getAllAccounts().stream().min(comparing(Account::getBirthday)).get();
    }
}

