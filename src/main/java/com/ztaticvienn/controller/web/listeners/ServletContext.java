package com.ztaticvienn.controller.web.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by mike on 27.05.14.
 */
public class ServletContext implements ServletContextListener {

    private static final String USER = "root";
    private static final String PASSWORD = "12345";
    private static final String DRIVER_NAME = "org.gjt.mm.mysql.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost/employees";



    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        try {
            Class.forName(DRIVER_NAME);


        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }



    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
