package com.ztaticvienn.controller.entities;

import java.util.Date;

/**
 * Created by mike on 16.05.14.
 */
public class HourlyWageEmployee extends Employee{
    public HourlyWageEmployee(Integer id, String name, String surname, Date dateOfBirth, Double salary) {
        super(id, name, surname, dateOfBirth, salary);
    }

    @Override
    public Double calculateSalary() {
        return this.getSalary()*8*20;
    }
}
