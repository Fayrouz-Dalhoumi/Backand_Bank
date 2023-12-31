package com.iset.banking.common;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class Address {

    private String street;
    private String city;
    private Integer zipCode;
    private String country;
    private Integer countryCode;
}
