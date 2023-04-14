package com.example.httplistenerfilter;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {



    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String messageContext  = (String) getServletContext().getAttribute("message") ;
        String messageRequest = (String) request.getAttribute("message");
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "Context: "+messageContext + "</h1>");
        out.println("<h1>" + "Request: "+messageRequest + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}