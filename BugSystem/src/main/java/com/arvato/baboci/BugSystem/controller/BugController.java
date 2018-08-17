package com.arvato.baboci.BugSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.arvato.baboci.BugSystem.db.entity.Bug;
import com.arvato.baboci.BugSystem.repository.BugRepository;
import com.arvato.baboci.BugSystem.view.jsf.beans.RegisterView;
import com.arvato.baboci.BugSystem.view.jsf.beans.RegisterBug;

@Controller
public class BugController {

	@Autowired
	private BugRepository bugRepository;

	@Autowired
	private RegisterView registerView;
	
	@Autowired
	private RegisterBug registerBug;

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list() {
		registerView.setContent(bugRepository.findAll());
		return "list";
	}

	public void persistBug() {
		
	}

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@RequestMapping(value = "/basic")
	public String hello() {
		return "basic";
	}

	@RequestMapping(value = "/register")
	public ModelAndView register() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("register");
		modelAndView.getModel();
		return modelAndView;
	}

}
