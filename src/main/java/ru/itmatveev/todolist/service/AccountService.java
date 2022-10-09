package ru.itmatveev.todolist.service;

import org.springframework.stereotype.Service;
import ru.itmatveev.todolist.model.Account;
import ru.itmatveev.todolist.repository.AccountRepo;

import java.util.List;

@Service
public class AccountService {
    private final AccountRepo accountRepo;

    public AccountService(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    public List<Account> getAllAccounts(){
        return this.accountRepo.getAllAccounts();
    }

    public Account getAccountByLogin(String login){
        return this.accountRepo.getAccountByLogin(login);
    }

    public void regAccount(Account account){
        this.accountRepo.regAccount(account);
    }
}
