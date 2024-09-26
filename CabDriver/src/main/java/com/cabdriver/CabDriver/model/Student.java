package com.cabdriver.CabDriver.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {
    @Id
    int id;
    String name;
    String classname;
    @ManyToMany (mappedBy = "student")
   List <Laptop> laptop;

    public Student() {

    }

    public Student(int id, String name, String classname, List <Laptop> laptop) {
        this.id = id;
        this.name = name;
        this.classname = classname;
        this.laptop = laptop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }
}
