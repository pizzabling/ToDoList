package ru.itmatveev.todolist.repository;

import org.springframework.stereotype.Repository;
import ru.itmatveev.todolist.model.Account;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountRepo {

    private List<Account> accounts = new ArrayList<>();

    public AccountRepo(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Account getAccountByLogin(final String login) {
        Account account = null;
        for (Account a : accounts) {
            if (a.getLogin().equals(login)) {
                account = a;
            } else
                account = null;
        }
        return account;
    }

    public List<Account> getAllAccounts() {
        return this.accounts;
    }

    public void regAccount(Account account){
        accounts.add(account);
    }
}
