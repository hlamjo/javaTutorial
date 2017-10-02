package com.example.web;

import com.example.model.BeerExpert;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BeerSelect extends javax.servlet.http.HttpServlet {
    public void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        BeerExpert be = new BeerExpert();

        //response.setContentType("text/html");
        //PrintWriter out = response.getWriter();
        //out.println("Beer Selection Advice<br>");
        String c = request.getParameter("color");

        List brands = be.getBrands(c);


        request.setAttribute("styles", brands);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);

        //out.println("<br>Just taste:<br>" );
        //for (int i = 0; i < brands.size(); i++) {
        //    out.println("   " + brands.get(i) + "<br>");
        //}


        List styles = (List)request.getAttribute("styles");

    }

    public void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
