package com.arvato.baboci.BugSystem.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
//@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	private int id;
	
	@Column(name = "emp_name")
	@NotEmpty(message = "*Please provide your name")
	private String emp_name;
	
	@Column(name = "emp_surname")
	private String emp_surname;

}
