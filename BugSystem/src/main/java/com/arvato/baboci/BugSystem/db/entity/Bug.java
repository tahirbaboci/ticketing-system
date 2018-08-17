package com.arvato.baboci.BugSystem.db.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
//@Table(name = "Bugs")
public class Bug {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bug_id")
	private int id;

	@Column(name = "bug_name")
	@NotEmpty(message = "*Please provide bug name")
	private String bug_name;
	
	@Column(name = "bug_description")
	private String bug_description;

	/*
	@Column(name = "bug_holders_id")
	@NotEmpty(message = "*Please provide your ID")
	private String bug__holders_id;
	*/
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "bug_emp", joinColumns = @JoinColumn(name = "bug_id"), inverseJoinColumns = @JoinColumn(name = "emp_id"))
	private Set<Employee> emp;
	
	@Column(name = "bug_importance")
	private String bug_importance;
	
	@Column(name = "date")
	private String date;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBug_name() {
		return bug_name;
	}

	public void setBug_name(String bug_name) {
		this.bug_name = bug_name;
	}

	public String getBug_description() {
		return bug_description;
	}

	public void setBug_description(String bug_description) {
		this.bug_description = bug_description;
	}

	public String getBug_importance() {
		return bug_importance;
	}

	public void setBug_importance(String bug_importance) {
		this.bug_importance = bug_importance;
	}

	public Set<Employee> getEmp() {
		return emp;
	}

	public void setEmp(Set<Employee> emp) {
		this.emp = emp;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
	
	
}
