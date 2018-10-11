package com.bobocode.dao.impl;

import com.bobocode.dao.AccountDao;
import com.bobocode.model.Account;
import com.bobocode.util.TestDataGenerator;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FakeAccountDao implements AccountDao {
    @Override
    public void save(Account account) {
        throw new UnsupportedOperationException("This DAO implementation does not support save()");
    }

    @Override
    public List<Account> findAll() {
        return TestDataGenerator.getAccountList(10);
    }
}
