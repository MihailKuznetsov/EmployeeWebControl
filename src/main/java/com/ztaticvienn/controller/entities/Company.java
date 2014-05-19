package com.ztaticvienn.controller.entities;

import java.util.List;

/**
 * Created by mike on 16.05.14.
 */
public class Company {
    private static Company ourInstance = new Company();

    private List<Employee> employees;

    public static Company getInstance() {
        return ourInstance;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    private Company() {
    }
}
