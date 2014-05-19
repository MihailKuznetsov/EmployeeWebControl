package com.ztaticvienn.controller.servlets;

import java.io.IOException;

/**
 * Created by mike on 16.05.14.
 */
public class IndexServlet extends javax.servlet.http.HttpServlet {


    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
        request.getRequestDispatcher("/index.jsp").include(request, response);

    }
}
