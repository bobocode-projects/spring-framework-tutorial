package com.bobocode.web.controller;

import com.bobocode.model.Account;
import com.bobocode.util.TestDataGenerator;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/generate")
    public String generate(Model model) {
        Account account = TestDataGenerator.getAccount();
        model.addAttribute("account", account);
        return "account";
    }

    /**
     * Handles POST request and forwards {@link Account} instance to the account.jsp view. Suppose you have an HTML form
     * that uses method POST and submits data to this controller. Spring will handle the request, create {@link Account}
     * instance and set all account fields that match form input parameters.
     *
     * @param account instance that is created using HTML form input parameters
     * @param model   created and passed by Spring
     * @return the view name
     */
    @PostMapping
    public String post(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Account account, Model model) {
        model.addAttribute(account);
        return "account";
    }

    @GetMapping("/add")
    public String getAccountForm() {
        return "accountForm";
    }
}
