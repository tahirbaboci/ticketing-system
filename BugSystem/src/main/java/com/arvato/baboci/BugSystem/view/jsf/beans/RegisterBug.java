package com.arvato.baboci.BugSystem.view.jsf.beans;

import java.util.Set;

import org.springframework.stereotype.Component;

import com.arvato.baboci.BugSystem.db.entity.Employee;

@Component
public class RegisterBug {
	private int id;
	private String bug_name;

	private String bug_description;
	/*
	 * private String bug__holders_id;
	 */
	private Set<Employee> emp;
	private String bug_importance;
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

	public Set<Employee> getEmp() {
		return emp;
	}

	public void setEmp(Set<Employee> emp) {
		this.emp = emp;
	}

	public String getBug_importance() {
		return bug_importance;
	}

	public void setBug_importance(String bug_importance) {
		this.bug_importance = bug_importance;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
