package com.bobocode.service;

import com.bobocode.dao.AccountDao;
import com.bobocode.model.Account;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
@Transactional
public class AccountService {
    private AccountDao accountDao;

    public AccountService(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void save(Account account) {
        accountDao.save(account);
    }

    public void withdraw(long accountId, BigDecimal value) {
        Account account = accountDao.findById(accountId);
        account.setBalance(account.getBalance().add(value));
    }

    @Transactional(readOnly = true)
    public void printAllAccounts() {
        List<Account> accounts = accountDao.findAll();
        accounts.forEach(System.out::println);
    }
}
