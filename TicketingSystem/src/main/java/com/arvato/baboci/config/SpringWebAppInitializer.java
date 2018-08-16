package com.arvato.baboci.config;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
 
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;
 
public class SpringWebAppInitializer implements WebApplicationInitializer {
 
    public void onStartup(ServletContext container) throws ServletException {
    	
        AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
        appContext.register(ApplicationContextConfig.class); // ApplicationContextConfig is our class which is taking place of a dispatcher-servlet.xml
        //appContext.setConfigLocation("com.example.app.config");
        
        //Another way to configure
        //XmlWebApplicationContext context = new XmlWebApplicationContext();
        //context.setConfigLocation("/WEB-INF/spring/dispatcher-config.xml");
        
        //add spring characterEncoding filter
        //to always have encoding on all requests
        EnumSet<DispatcherType> dispatcherTypes = EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.ERROR);
        
        ServletRegistration.Dynamic dispatcher = container.addServlet("SpringDispatcher", new DispatcherServlet(appContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
 
        // UtF8 Charactor Filter.
        FilterRegistration.Dynamic fr = container.addFilter("encodingFilter", CharacterEncodingFilter.class);
        //security
        FilterRegistration.Dynamic characterEncoding = container.addFilter("springSecurityFilterChain", DelegatingFilterProxy.class);
        characterEncoding.addMappingForUrlPatterns(dispatcherTypes, true, "/*");
        characterEncoding.setAsyncSupported(true);

 
        fr.setInitParameter("encoding", "UTF-8");
        fr.setInitParameter("forceEncoding", "true");
        fr.addMappingForUrlPatterns(null, true, "/*");
    }
 
}