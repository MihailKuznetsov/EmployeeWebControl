package com.ztaticvienn.controller;

import com.ztaticvienn.controller.database.DatabaseAccess;
import com.ztaticvienn.controller.entities.*;

import com.ztaticvienn.controller.util.DateParser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mike on 23.05.14.
 */
public class Test {
    public static void main(String[] args) {
        //Employee emp = new FixedSalaryEmployee(2, "Jack", "Welker", DateParser.getDateFromString("1967-01-24"), 555.5);
//        emp.setId(2);
//        emp.setName("Jack");
//        emp.setSurname("Welcker");
//        emp.setDateOfBirth(DateParser.getDateFromString("1967-01-24"));
//        emp.setSalary(555.5);
        //System.out.println(DateParser.getStringFromDate(emp.getDateOfBirth()));
        //DatabaseAccess.addEmployeeToDatabase(emp);
        //System.out.println(DateParser.getStringFromDate(emp.getDateOfBirth()));
        Company company = Company.getInstance();
        List<Employee> freshEmployees = new ArrayList<Employee>();
        freshEmployees.add(DatabaseAccess.getEmployeeFromDatabaseById(2));
        for(Employee employee: freshEmployees){
            System.out.println(employee.getName());
        }


    }
}
