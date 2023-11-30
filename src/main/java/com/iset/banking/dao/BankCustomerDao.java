package com.iset.banking.dao;

import com.iset.banking.dao.entities.BankCustomer;

import java.util.List;

// Contrat de service pour la composante DAO de BankCustomer
public interface BankCustomerDao {

    void addBankCustomer(BankCustomer bankCustomer);

    void updateBankCustomer(BankCustomer bankCustomer);

    void deleteBankCustomer(Integer id);

    BankCustomer findByUsername(String username);

    BankCustomer getBankCustomerById(Integer id);

    List<BankCustomer> getAllCustomers();

}
