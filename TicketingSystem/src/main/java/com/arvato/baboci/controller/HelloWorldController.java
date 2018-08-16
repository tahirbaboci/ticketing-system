package com.arvato.baboci.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.arvato.baboci.config.ApplicationContextConfig;

@Controller
public class HelloWorldController {
	
	
	
	@Autowired
    private ApplicationContextConfig dataSourceConfiguration;
    @RequestMapping(value = "/")
    public String helloWorld(ModelMap model) {
    	
        final DataSource dataSource = dataSourceConfiguration.getDataSource();
        List<String> list = new ArrayList<String>();
        
        try {
            final Connection connection = dataSource.getConnection();
            final Statement statement = connection.createStatement();
            final ResultSet resultSet = statement.executeQuery("SELECT * FROM TEST");
            while (resultSet.next()) {
                final String owner_name = resultSet.getString("NAME");
                list.add(owner_name);
            }
            System.out.println(list);
            connection.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        model.addAttribute("names", list);
        return "index";
    }
	
    
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String sayHello(ModelMap model){// returns the model and logical view name
		
		model.addAttribute("message", "welcome from spring mvc");
		return "index";
	}

	@RequestMapping(value="/hello/helloAgain/{user}", method=RequestMethod.GET)
	public String sayHelloAgain(@PathVariable("user") String user, ModelMap model){			// returns the model and logical view name
		
		model.addAttribute("message", "welcome again from spring mvc");
		model.addAttribute("userdata", user);
		return "index";
	}
	
	@RequestMapping("/welcome") //tells Spring that this Controller should process all requests beginning with /welcome in the URL path.
	public ModelAndView helloWorld(){
		
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3> This message is coming from HelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome","message",message);
		//The ModelAndView object tries to resolve to a view named “welcome”
		//The ModelAndView object contains a message with key “message” and Detailed value.
	}
	
	
	
	
	
}
