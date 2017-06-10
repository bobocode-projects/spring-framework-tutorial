package com.bobocode.service.impl;

import com.bobocode.model.Account;
import com.bobocode.service.AccountService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    @Override
    public List<Account> getAllAccounts() {
        List<Account> accounts = new ArrayList<>(6);
        accounts.add(new Account("Will", "Smith", "wsmith@gmail.com", "test",
                LocalDate.of(1968, 8, 25), BigDecimal.valueOf(104065.25)));
        accounts.add(new Account("Tom", "Hanks", "thanks@gmail.com", "test",
                LocalDate.of(1956, 7, 9), BigDecimal.valueOf(93065.25)));
        accounts.add(new Account("Russell", "Crowe", "rcrowe@gmail.com", "test",
                LocalDate.of(1964, 4, 7), BigDecimal.valueOf(87641.98)));
        accounts.add(new Account("Robert", "Downey", "mperry@gmail.com", "test",
                LocalDate.of(1965, 4, 9), BigDecimal.valueOf(152345)));
        accounts.add(new Account("Robert", "De Niro", "mperry@gmail.com", "test",
                LocalDate.of(1943, 8, 17), BigDecimal.valueOf(67065.45)));
        accounts.add(new Account("Metthew", "Perry", "mperry@gmail.com", "test",
                LocalDate.of(1969, 8, 19), BigDecimal.valueOf(45678.12)));
        return accounts;
    }
}

