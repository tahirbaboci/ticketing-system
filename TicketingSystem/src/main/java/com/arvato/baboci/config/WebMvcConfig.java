package com.arvato.baboci.config;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


public class WebMvcConfig extends WebMvcConfigurerAdapter {
	
	public void addResourceHandlers(ResourceHandlerRegistry registry){
		//default
	}
	
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
		configurer.enable();
	}
}
