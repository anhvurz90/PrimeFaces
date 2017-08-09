package com.anhvurz90.sitemonitoring.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class MyWebAppInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext container) throws ServletException {
        // Create the 'root' Spring applicatoin context
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(SpringConfiguration.class);
        
        // Manage the lifecycle of the root application context
        container.addListener(new ContextLoaderListener(rootContext));
        
    }

}
