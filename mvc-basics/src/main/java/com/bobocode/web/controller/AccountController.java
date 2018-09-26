package com.bobocode.web.controller;

import com.bobocode.model.Account;
import com.bobocode.util.TestDataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
}
