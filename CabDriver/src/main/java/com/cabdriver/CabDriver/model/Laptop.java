package com.cabdriver.CabDriver.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Laptop {
    @Id
    int id;
    String name;
    @ManyToMany
    List <Student> student;
}
