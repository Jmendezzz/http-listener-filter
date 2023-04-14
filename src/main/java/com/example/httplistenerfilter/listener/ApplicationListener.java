package com.example.httplistenerfilter.listener;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionListener;


@WebListener
public class ApplicationListener implements HttpSessionListener, ServletRequestListener, ServletContextListener {

    private ServletContext servletContext;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context Initialized!");
        servletContext= sce.getServletContext();
        servletContext.setAttribute("message","Hello from Context Initialized");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Hello from Request Initialized");
        sre.getServletRequest().setAttribute("message","Hello from Request Initialized");
    }
}
