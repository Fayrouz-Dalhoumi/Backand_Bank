package com.iset.banking.dao;

import com.iset.banking.dao.entities.Account;

import java.util.List;


public interface AccountDao {

    void saveOrUpdate(Account account);

    void deleteAccount(Integer id);

    Account getAccountById(Integer id);

    List<Account> getAllAccounts();
}
