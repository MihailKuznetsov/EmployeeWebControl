package com.ztaticvienn.controller.web;

import com.ztaticvienn.controller.entities.Company;
import com.ztaticvienn.controller.entities.Employee;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by mike on 16.05.14.
 */
public class ShowServlet extends javax.servlet.http.HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Employee> employees = Company.getInstance().getEmployees();




        request.setAttribute("list",employees);
        request.getRequestDispatcher("/WEB-INF/showemployees.jsp").include(request, response);

    }
}
