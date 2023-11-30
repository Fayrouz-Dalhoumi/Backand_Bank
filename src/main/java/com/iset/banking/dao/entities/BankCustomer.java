package com.iset.banking.dao.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.iset.banking.common.Address;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
//@Table(name = "Client")
public class BankCustomer /* PascalCase ==> Bank_Customer */ {


    @Id
    @GeneratedValue
    private Integer id;
    private String firstName; // camelCase ==> first_name
    private String lastName; // last_name
    private Integer cin;
    @Embedded
    private Address address;
    private String username;
    private String password;


    @ManyToMany
    @JoinTable(name = "USER_ROLE",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "idRole")}
    )
    private List<Role> roles = new ArrayList<>();

    @ManyToOne
//    @JoinColumn(name = "FK_ID_BANK", referencedColumnName = "id")
    private Bank bank;

    @OneToMany(mappedBy = "bankCustomer")
    private List<Account> account;
}
