package com.capgemini.demohibernateonetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.demohibernateonetoone.entity.Person;
import com.capgemini.demohibernateonetoone.entity.Profile;
import com.capgemini.demohibernateonetoone.service.PersonService;

@RestController
public class DemoController {

	@Autowired
	PersonService service;

	@RequestMapping("/hello")
	public String hello() {
		return "hello world..";
	}

	@RequestMapping("/profile")
	public Person getProfile() {
		
		Person person = new Person(108, "tony", new Profile(403, "abbas"));
		
		service.addNew(person);
		return person;
	}
	
}
