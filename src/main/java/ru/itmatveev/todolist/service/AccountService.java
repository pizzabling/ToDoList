package ru.itmatveev.todolist.service;

import org.springframework.stereotype.Service;
import ru.itmatveev.todolist.model.Account;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {
    private List<Account> accountList = new ArrayList<>();

    public List<Account> getAccountList(){
        return accountList;
    }

    public void registerAccount(Account account){
        accountList.add(account);
    }

    public void updatePassword(long id, String password){
        Account account = null;
        for (Account a : accountList){
            if (a.getId().equals(id)){
                account = a;
                break;
            }
        }
        if (account != null){
            account.setPassword(password);
        }
    }

    public void updateNickname(long id, String nickname){
        Account account = null;
        for (Account a : accountList){
            if (a.getId().equals(id)){
                account = a;
                break;
            }
        }
        if (account != null){
            account.setNickname(nickname);
        }
    }
}
