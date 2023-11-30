package com.iset.banking.dao.repositories;

import com.iset.banking.dao.entities.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Integer> {
}
