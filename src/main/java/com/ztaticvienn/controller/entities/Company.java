package com.ztaticvienn.controller.entities;

import com.ztaticvienn.controller.comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by mike on 16.05.14.
 */
public class Company {

    private static Company ourInstance = null;

    private List<Employee> employees = new ArrayList<Employee>() {
    };

    public static Company getInstance() {
        if(ourInstance==null)
            synchronized (Company.class){
                if(ourInstance==null){
                    ourInstance = new Company();
                }
            }
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

    public void addEmployee(Integer id, String name, String surname, Date dateOfBirth, Double salary, String salaryType){
        Employee newEmployee = null;
        if(salaryType.equals("fixedsalary")){
            newEmployee = new FixedSalaryEmployee(id, name, surname, dateOfBirth, salary);
        } else if(salaryType.equals("hourlywage")){
            newEmployee = new HourlyWageEmployee(id, name, surname, dateOfBirth, salary);
        }

        employees.add(newEmployee);
    }

    public  void sortEmployees(String sortBy){
        if (sortBy.equals("id")) {
            Collections.sort(employees, new EmployeeIdComparator());
        } else if(sortBy.equals("name")) {
            Collections.sort(employees, new EmployeeNameComparator());
        } else if(sortBy.equals("surname")) {
            Collections.sort(employees, new EmployeeSurnameComparator());
        } else if(sortBy.equals("date")) {
            Collections.sort(employees, new EmployeeDateComparator());
        } else if(sortBy.equals("salary")) {
            Collections.sort(employees, new EmployeeSalaryComparator());
        }
    }
}
