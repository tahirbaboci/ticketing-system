package com.arvato.baboci.Model;

import java.util.ArrayList;
import java.util.List;

public class Bug {
	private int BugId;
	private String name;
	private String description;
	private String BugHoldersName;
	private String Importance;
	
	public List<String> getList() {
		List<String> list = new ArrayList<String>();
		list.add("List A");
		list.add("List B");
		list.add("List C");
		return list;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getBugHoldersName() {
		return BugHoldersName;
	}
	public void setBugHoldersName(String bugHoldersName) {
		BugHoldersName = bugHoldersName;
	}
	
	public String getImportance() {
		return Importance;
	}
	public void setImportance(String importance) {
		Importance = importance;
	}

	public void setBugId(int bugId) {
		BugId = bugId;
	}
	public int getBugId() {
		return BugId;
	}

}
