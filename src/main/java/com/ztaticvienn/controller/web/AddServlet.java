package com.ztaticvienn.controller.web;

import com.ztaticvienn.controller.database.DatabaseAccess;
import com.ztaticvienn.controller.entities.Company;
import com.ztaticvienn.controller.entities.Employee;
import com.ztaticvienn.controller.entities.FixedSalaryEmployee;
import com.ztaticvienn.controller.entities.HourlyWageEmployee;
import com.ztaticvienn.controller.util.DateParser;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.Date;

/**
 * Created by mike on 27.05.14.
 */
public class AddServlet extends javax.servlet.http.HttpServlet{

    @Override
    public void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException, ServletException {

        Integer id = null;

        String name = null;

        String surname = null;

        Date dateOfBirth = null;

        Double salary = null;

        String salaryType = null;

        Employee newEmp = null;

        String message = null;

        try {

        id=Integer.valueOf(request.getParameter("id"));
        name=request.getParameter("name");
        surname=request.getParameter("surname");
        dateOfBirth=DateParser.getDateFromString(request.getParameter("dateofbirth"));
        salary=Double.valueOf(request.getParameter("salary"));

        salaryType=request.getParameter("salarytype");

        request.getParameter("name");

        if(salaryType.equals("fixedsalary")) {
            newEmp = new FixedSalaryEmployee(id, name, surname, dateOfBirth, salary);
        }else if(salaryType.equals("hourlywages")){
            newEmp = new HourlyWageEmployee(id, name, surname, dateOfBirth, salary);
        }
        Company company = Company.getInstance();
        company.getEmployees().add(newEmp);

    }catch (Exception e){
        e.printStackTrace();
    }

        message=(newEmp!=null)?"Successfully added:"+newEmp.toString():"error";
        request.setAttribute("message", message);
        request.getRequestDispatcher("/WEB-INF/addinfo.jsp").forward(request, response);
    }

    @Override
    public void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response){

    }
}
