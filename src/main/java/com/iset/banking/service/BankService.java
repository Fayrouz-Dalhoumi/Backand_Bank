package com.iset.banking.service;

import com.iset.banking.dao.entities.Bank;

import java.util.List;


public interface BankService {

    void add(Bank bank);

    void update(Bank bank);

    void delete(Integer id);

    Bank findById(Integer id);

    List<Bank> findAll();
}
