package com.arvato.baboci.dao;

import java.util.List;
import javax.sql.DataSource;

import com.arvato.baboci.Model.Bug;
import com.arvato.baboci.Model.Employee;

public interface BugDAO {

	/** 
     * This is the method to be used to initialize
     * database resources ie. connection.
  */
  public void setDataSource(DataSource ds);
  
  /** 
     * This is the method to be used to create
     * a record in the Student table.
  */
  public void create(Bug b);
  
  /** 
     * This is the method to be used to list down
     * a record from the Bug table corresponding
     * to a passed Bug id.
  */
  public Bug getBug(Integer BugId);
  
  /** 
     * This is the method to be used to list down
     * all the records from the Bugs table.
  */
  public List<Bug> listBugs();
  
  /** 
     * This is the method to be used to delete
     * a record from the Bug table corresponding
     * to a passed Bug id.
  */
  public void delete(Integer BugId);
  
  /** 
     * This is the method to be used to update
     * a record into the Bug table.
  */
  public void update(Integer BugId);
}
