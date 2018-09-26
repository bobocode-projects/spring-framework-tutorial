package com.bobocode.web.controller;

import com.bobocode.model.Account;
import com.bobocode.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(value = "/accounts")
public class AccountRestController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public List<Account> getAll() {
        return accountService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Account get(@PathVariable Long id) {
        return accountService.findById(id);
    }

    @PostMapping
    public void postUser(@RequestBody Account account) {
        accountService.save(account);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody Account account) {
        if (!Objects.equals(id, account.getId())) {
            throw new IllegalStateException("Invalid account id");
        }
        accountService.save(account);
    }

    @DeleteMapping("/{id}")
    public void removeUser(@PathVariable Long id) {
        Account account = accountService.findById(id);
        accountService.remove(account);
    }
}
