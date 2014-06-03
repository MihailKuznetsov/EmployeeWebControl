package com.ztaticvienn.controller.entities;

import com.ztaticvienn.controller.util.DateParser;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by mike on 16.05.14.
 */
public abstract class Employee{

    private Integer id;

    private String name;

    private String surname;

    private Date dateOfBirth;

    private Double salary;

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

        return  dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirthString(){
        return DateParser.getStringFromDate(this.dateOfBirth);
    }

    public void setDateOfBirthString(String dateOfBirth){
        this.dateOfBirth=DateParser.getDateFromString(dateOfBirth);
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }



    public abstract Double calculateSalary();

    public Employee(Integer id, String name, String surname, Date dateOfBirth, Double salary){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.dateOfBirth=dateOfBirth;
        this.salary=salary;
    }

    public String getEmployeeType(){
        if(this instanceof FixedSalaryEmployee)
        return "fixedsalary";
        else if(this instanceof HourlyWageEmployee)
        return "hourlywages";

        return "undefined";
    }



    @Override
    public String toString(){
        return getId()+" "+getName()+" "+getSurname()+" "+ DateParser.getStringFromDate(getDateOfBirth())+" "+getSalary()+" "+getEmployeeType();
    }

}

