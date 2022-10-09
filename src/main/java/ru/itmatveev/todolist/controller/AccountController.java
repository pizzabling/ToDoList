package ru.itmatveev.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itmatveev.todolist.model.Account;
import ru.itmatveev.todolist.service.AccountService;

import java.util.List;

@RestController
public class AccountController {
    private long id = 0;
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/accounts")
    public List<Account> getAllAccounts(){
        return this.accountService.getAllAccounts();
    }

    @GetMapping("/reg")
    public void regAccount(@RequestParam(value = "nickname") String nickname,
                           @RequestParam(value = "login") String login,
                           @RequestParam(value = "password") String password
                           ){
        Account account = new Account(id, nickname, login, password);
        this.accountService.regAccount(account);
        id++;
    }
}
