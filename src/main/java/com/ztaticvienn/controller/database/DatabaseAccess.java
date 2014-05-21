package com.ztaticvienn.controller.database;

import com.ztaticvienn.controller.entities.Employee;
import com.ztaticvienn.controller.entities.FixedSalaryEmployee;

/**
 * Created by mike on 21.05.14.
 */
public class DatabaseAccess {

    private static final String USER = "root";
    private static final String PASSWORD = "12345";
    private static final String DRIVER_PATH = "org.gjt.mm.mysql.Driver";
    private static final String DATABASE_PATH = "jdbc:mysql://localhost/data";


    public static void addEmployeeToDatabase(Employee employee){
        String id=employee.getId().toString();
        String name=employee.getName().toString();
        String surname=employee.getSurname().toString();
        String dateOfBirth=employee.getDateOfBirth().toString();
        String salary=employee.getSalary().toString();
        String salarytype=employee instanceof  FixedSalaryEmployee?"fixedsalary":"hourlywages";

    }

    public static void clearDatabase(Employee employee){

    }

    public static Employee getEmployeeFromDatabaseById(Integer id){

        Employee employee = new FixedSalaryEmployee();
        return employee;
    }
}