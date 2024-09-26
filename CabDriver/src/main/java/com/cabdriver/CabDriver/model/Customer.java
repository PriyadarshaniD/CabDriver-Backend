package com.cabdriver.CabDriver.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Entity annotation will convert a customer model to customer table in our database
@Entity
public class Customer  {

    @Id
    private int id;
    private int age;
    private String password;
    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(unique = true)
    private long PhoneNumber;
    private String address;
}
