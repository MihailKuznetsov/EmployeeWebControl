package com.ztaticvienn.controller;

import java.sql.*;

/**
 * Created by mike on 21.05.14.
 */
public class Runner {

    private static final String USER = "root";
    private static final String PASSWORD = "12345";
    private static final String DRIVER_PATH = "org.gjt.mm.mysql.Driver";
    private static final String DATABASE_PATH = "jdbc:mysql://localhost/data";

    private static final String REQUEST = "CREATE TABLE IF NOT EXISTS employees (id int(64) NOT NULL,"
            +"name varchar(255) NOT NULL,"
            +"surname varchar(255) NOT NULL,"
            +"birthdate date NOT NULL,"
            +"salary float(5,2) NOT NULL,"
            +"typesalary ENUM('fixedsalary','hourlywages') NOT NULL,"
            +"UNIQUE (id));";

    private static final String ADD_REQUEST = "INSERT INTO employees (id, name, surname, birthdate, salary, typesalary)" +
            "VALUES ('1','John','Smith','1985-06-15','600.5','hourlywages')";

    private static final String DROP_REQUEST = "DROP TABLE IF EXISTS employees";

    public static void main (String[] args){
        try{
            Class.forName("org.gjt.mm.mysql.Driver"); //Load the driver
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employees", "root", "12345"); //Connect

            //System.out.println(REQUEST);
            conn.createStatement().execute(DROP_REQUEST);
            conn.createStatement().execute(REQUEST);
            conn.createStatement().execute(ADD_REQUEST);

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM employees ORDER BY id;");
            while (rs.next() == true){
                System.out.println(rs.getString("name")+" "+rs.getString("surname")+" "+rs.getString("typesalary"));
                }
        }
        catch (Exception err){
            System.out.println(err.getMessage());
        }
    }
}
