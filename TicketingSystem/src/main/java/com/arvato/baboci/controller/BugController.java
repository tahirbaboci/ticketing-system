package com.arvato.baboci.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.arvato.baboci.Model.Bug;

@Controller
@RequestMapping(value="/bug")
public class BugController {

	@RequestMapping("/bug")
	public void bug(ModelMap model){
		
	}
	
	@RequestMapping("/bug/add")
	public void add(Bug bug){
		
	}
	@RequestMapping("/bug/update")
	public void update(Bug bug){
		
	}
	@RequestMapping("/bug/delete")
	public void delete(int BugId){
		
	}
	@RequestMapping("/bug/find")
	public Bug find(int BugId){
		
		return null;
	}
	@RequestMapping("/bug/listAll")
	public void listAll(){
		
	}
	
	
	
	
	
	/*
	 * @RequestMapping(value="/addBug")
	//The view can take the form of a String view name which will need to be resolved by a ViewResolver object; alternatively a View object can be specified directly. The model is a Map, allowing the use of multiple objects keyed by name.
	public ModelAndView addBug(){
		Bug b = new Bug();
		b.setBugId(1);
		b.setName("Bugnameeee");
		b.setDescription("asdasdasdasdadasdad DESCRIPTION");
		b.setBugHoldersName("iri");
		b.setImportance("Hight");
		
		ModelAndView mv = new ModelAndView("addBug");
		mv.addObject("msg", "Annotated Controller");
        return mv;
	}	
	
	
	
	
	@RequestMapping(value = "/addBug", method = RequestMethod.GET)
	public ModelAndView getdata() {

		Bug b = new Bug();
		List<String> list = b.getList();

		ModelAndView model = new ModelAndView("addBug");
		model.addObject("lists", list);

		return model;

	}
	 */
}
