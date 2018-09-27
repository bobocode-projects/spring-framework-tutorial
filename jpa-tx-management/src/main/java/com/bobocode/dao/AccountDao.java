package com.bobocode.dao;

import com.bobocode.model.Account;

import java.util.List;

public interface AccountDao {
    List<Account> findAll();

    Account findById(long id);

    void save(Account account);
}
