package com;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        java.util.Date today = new java.util.Date();
        out.println("<html>" +
                    "<body>" +
                    "<hi align=center>HF\'s serv</h1>" +
                    "<br1>" + today + "</body>" + "</html>");
    }
}