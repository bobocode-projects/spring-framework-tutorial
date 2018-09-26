package com.bobocode.service;


import com.bobocode.exception.EntityNotFoundException;
import com.bobocode.model.Account;
import com.bobocode.model.User;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AccountService {

    private Map<Long, Account> accountMap = new HashMap<>();

    public List<Account> findAll() {
        return new ArrayList<>(accountMap.values());
    }

    public void save(Account account) {
        if (account.getId() == null) {
            long id = accountMap.size() + 1;
            account.setId(id);
            accountMap.put(id, account);
        } else {
            accountMap.put(account.getId(), account);
        }
    }

    public void save(Long id, Account account){

    }

    public Account findById(Long id) {
        Account account = accountMap.get(id);
        if (account == null) {
            throw new EntityNotFoundException("Account not found by id=" + id);
        } else {
            return account;
        }
    }

    public void remove(Account account) {
        if (account.getId() != null) {
            accountMap.remove(account.getId());
        }
    }


}
