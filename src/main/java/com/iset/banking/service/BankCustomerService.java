package com.iset.banking.service;

import com.iset.banking.dao.entities.BankCustomer;

import java.util.List;


public interface BankCustomerService {

    void add(BankCustomer bankCustomer);

    void update(BankCustomer bankCustomer);

    void delete(Integer id);

    BankCustomer findByUsername(String username);

    BankCustomer findById(Integer id);

    List<BankCustomer> findAll();
}
