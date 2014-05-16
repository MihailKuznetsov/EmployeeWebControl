package com.ztaticvienn.controller.entities;

import java.util.Date;

/**
 * Created by mike on 16.05.14.
 */
public abstract class Employee {

    private Integer id;

    private String name;

    private String surname;

    private Date dateOfBirth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public abstract Double calculateSalary();
}
