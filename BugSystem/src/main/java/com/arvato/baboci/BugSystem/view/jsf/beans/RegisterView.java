package com.arvato.baboci.BugSystem.view.jsf.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.arvato.baboci.BugSystem.db.entity.Bug;
import com.arvato.baboci.BugSystem.db.entity.Employee;

@Component
public class RegisterView {
	private List<Bug> content = new ArrayList<>();

	public List<Bug> getContent() {
		return content;
	}

	public void setContent(List<Bug> content) {
		this.content = content;
	}
}
