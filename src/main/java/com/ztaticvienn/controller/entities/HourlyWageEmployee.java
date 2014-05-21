package com.ztaticvienn.controller.entities;

/**
 * Created by mike on 16.05.14.
 */
public class HourlyWageEmployee extends Employee{
    @Override
    public Double calculateSalary() {
        return this.getSalary()*8*20;
    }
}
