package com.arvato.baboci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arvato.baboci.db.entity.Bug;
import com.arvato.baboci.db.repository.BugRepository;

@RestController
public class BasicController {

	@Autowired
	private BugRepository repository;

	@RequestMapping("/test")
	public String dispater() {
		//Bug bug = new Bug();
		//bug.setBugName("testBug");
		//repository.save(bug);
		//String result = repository.findAllByBugName("testBug").getBugName();
		return repository.findAll().toString();
	}
	
	@RequestMapping(value = "/testMVC")
	public String mvcExample() {
		return "testMVC2";
	}

}
