package com.bobocode.dao;

import com.bobocode.model.Account;

import java.util.List;

public interface AccountDao {
    void save(Account account);
    List<Account> findAll();
}
