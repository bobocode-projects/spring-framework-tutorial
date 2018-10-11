package com.bobocode.dao.impl;

import com.bobocode.dao.AccountDao;
import com.bobocode.model.Account;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Primary
public class InMemAccountDao implements AccountDao {
    private long idSequence = 1;
    private Map<Long, Account> accountMap = new HashMap<>();

    @Override
    public void save(Account account) {
        account.setId(idSequence++);
        accountMap.put(account.getId(), account);
    }

    @Override
    public List<Account> findAll() {
        return new ArrayList<>(accountMap.values());
    }
}
