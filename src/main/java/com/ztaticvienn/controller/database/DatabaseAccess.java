package com.ztaticvienn.controller.database;

import com.ztaticvienn.controller.entities.Employee;
import com.ztaticvienn.controller.entities.FixedSalaryEmployee;
import com.ztaticvienn.controller.entities.HourlyWageEmployee;
import com.ztaticvienn.controller.util.DateParser;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by mike on 21.05.14.
 */
public class DatabaseAccess {



    private static final String USER = "root";
    private static final String PASSWORD = "12345";
    private static final String DRIVER_NAME = "org.gjt.mm.mysql.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost/data";

    private static Connection connection;
    private static ResultSet resultSet;

    static {
        try {

            connection = DriverManager.getConnection("jdbc:mysql://localhost/employees", "root", "12345"); //Connect

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void addEmployeeToDatabase(Employee employee){


        String id=employee.getId().toString();
        String name=employee.getName().toString();
        String surname=employee.getSurname().toString();
        String dateOfBirth= DateParser.getStringFromDate(employee.getDateOfBirth());
        String salary=employee.getSalary().toString();

        String salarytype=employee instanceof  FixedSalaryEmployee?"fixedsalary":"hourlywages";

        try {
            connection.createStatement().execute("INSERT INTO employees (id, name, surname, birthdate, salary, typesalary)" +
                    "VALUES ('"+id+"','"+name+"','"+surname+"','"+dateOfBirth+"','"+salary+"','"+salarytype+"')");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }

    public static void clearDatabase(Employee employee){

    }

    public static Employee getEmployeeFromDatabaseById(Integer paramId){

        String id = null;
        String name = null;
        String surname = null;
        String dateOfBirth = null;
        String salary = null;
        String salarytype = null;
        Employee employee = null;

        try {
            resultSet = connection.createStatement().executeQuery("SELECT * FROM employees WHERE id="+paramId+";");
            while (resultSet.next() == true){
                id=resultSet.getString("id");
                name=resultSet.getString("name");
                surname=resultSet.getString("surname");
                dateOfBirth=resultSet.getString("birthdate");
                salary=resultSet.getString("salary");
                salarytype=resultSet.getString("typesalary");


                if(salarytype.equals("fixedsalary")){
                    employee = new FixedSalaryEmployee(Integer.valueOf(id), name, surname, DateParser.getDateFromString(dateOfBirth), Double.valueOf(salary));
                }else if(salarytype.equals("hourlywages")){
                    employee = new HourlyWageEmployee(Integer.valueOf(id), name, surname, DateParser.getDateFromString(dateOfBirth), Double.valueOf(salary));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }



        return employee;
    }

}