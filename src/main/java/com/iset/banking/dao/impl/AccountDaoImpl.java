package com.iset.banking.dao.impl;

import com.iset.banking.dao.AccountDao;
import com.iset.banking.dao.entities.Account;
import com.iset.banking.dao.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityNotFoundException;
import java.util.List;


@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void saveOrUpdate(Account account) {
        accountRepository.save(account);
    }


    @Override
    public void deleteAccount(Integer id) {
        accountRepository.deleteById(id);
    }

    @Override
    public Account getAccountById(Integer id) {
        return accountRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public List<Account> getAllAccounts() {
//        List<Account> all = accountRepository.findAll();
//        for (Account a : all){
//            System.out.println(a.toString());
//        }
       // all.forEach(System.out::println);  method reference
        return accountRepository.findAll();
    }
}
