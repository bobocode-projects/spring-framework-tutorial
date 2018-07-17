package com.bobocode.service;

import com.bobocode.model.Account;

import java.util.Optional;

public interface AccountService {
    Optional<Account> findOldestClient();
}
