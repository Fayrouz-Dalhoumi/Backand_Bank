package com.iset.banking.dao.repositories;

import com.iset.banking.dao.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountRepository extends JpaRepository<Account, Integer> {


}
