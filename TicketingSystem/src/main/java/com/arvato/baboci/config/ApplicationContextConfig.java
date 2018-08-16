package com.arvato.baboci.config;

import javax.sql.DataSource;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
//import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
 
@Configuration
@ComponentScan("com.arvato.baboci.*")
 
@EnableTransactionManagement
 
// Load to Environment.
@PropertySources({ @PropertySource("classpath:ds/datasource-cfg.properties") })
 
public class ApplicationContextConfig {
 
   // The Environment class serves as the property holder
   // and stores all the properties loaded by the @PropertySource
   //@Autowired
   //private Environment env;
 
	
   @Bean(name = "viewResolver")
   public InternalResourceViewResolver getViewResolver() {
       InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
 
       viewResolver.setPrefix("/WEB-INF/views/");
       viewResolver.setSuffix(".jsp");
 
       return viewResolver;
   }
 
   
   @Bean(name = "dataSource")
   public DataSource getDataSource() {

       final DriverManagerDataSource dataSource = new DriverManagerDataSource();
       dataSource.setDriverClassName("org.h2.Driver");
       dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
       dataSource.setUsername("sa");
       dataSource.setPassword("");
       
       System.out.println("## getDataSource: " + dataSource);
       
       return dataSource;

   }
 
   @Bean(name = "transactionManager")
   public DataSourceTransactionManager getTransactionManager() {
       DataSourceTransactionManager txManager = new DataSourceTransactionManager();
 
       DataSource dataSource = this.getDataSource();
       txManager.setDataSource(dataSource);
 
       return txManager;
   }
 
}