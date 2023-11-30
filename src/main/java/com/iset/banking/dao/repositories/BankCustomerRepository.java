package com.iset.banking.dao.repositories;

import com.iset.banking.dao.entities.BankCustomer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BankCustomerRepository extends JpaRepository<BankCustomer, Integer> {

    BankCustomer findByUsername(String username);
}
