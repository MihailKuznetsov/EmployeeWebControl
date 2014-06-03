package com.ztaticvienn.controller.web;

import com.ztaticvienn.controller.entities.Company;
import com.ztaticvienn.controller.entities.Employee;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by mike on 03.06.14.
 */
public class SortServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    Company.getInstance().sortEmployees(request.getParameter("sort"));


    }
}
