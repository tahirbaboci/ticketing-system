package com.arvato.baboci.dao.impl;


import java.util.List;

import javax.sql.DataSource;

import com.arvato.baboci.Model.Bug;
//import com.arvato.baboci.Model.Employee;
import com.arvato.baboci.dao.BugDAO;
import com.arvato.baboci.mapper.BugMapper;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class BugJDBCTemplate implements BugDAO {


	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(Bug b) {
		System.out.println("Bug created");
		//create JDBC template and pass dataSource as a reference
		//jdbcTemplateObject = new JdbcTemplate(dataSource);
		
		String SQL = "insert into Bug (BugId, BugName, BugDescription, BugHoldersName, Importance) values (?, ?, ?, ?, ?)";
	    jdbcTemplateObject.update( SQL, new Object[]{b.getBugId(), b.getName(), b.getDescription(), b.getBugHoldersName(), b.getImportance()});
	    System.out.println("Created Record Name = " + b.getName() + " Importance = " + b.getImportance());
	    return;
		
	}

	@Override
	public Bug getBug(Integer BugId) {
		  
		System.out.println("get the bug");

		String SQL = "select * from Bug where id = ?";
	    Bug bug = jdbcTemplateObject.queryForObject(SQL, new Object[]{BugId}, new BugMapper());
	      
	      return bug;
	}

	@Override
	public List<Bug> listBugs() {
		
		System.out.println("Bugs are listed");
		
		String SQL = "select * from Bug";
		List<Bug> bugs = jdbcTemplateObject.query(SQL, new BugMapper());
		System.out.println(bugs);
		return bugs;
	}
	
	@Override
	public void delete(Integer BugId) {
		
		System.out.println("Bug deleted");
	}

	@Override
	public void update(Integer BugId) {
		
		System.out.println("Bug updated");
	}
	
}
