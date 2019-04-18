package com.capgemini.demoinheritancemapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.demoinheritancemapping.entity.Employee;
import com.capgemini.demoinheritancemapping.entity.Person;
import com.capgemini.demoinheritancemapping.entity.Student;
import com.capgemini.demoinheritancemapping.service.PersonService;

@RestController
public class DemoController {

	@Autowired
	PersonService service;

	@RequestMapping("/new")
	public String addNew() {

		Employee e1 = new Employee(1, "kapil", "capgemini");
		Employee e2 = new Employee(4,"satyen","capgemini");

		Student s1 = new Student(2, "abbas", "DYPIEMR");
		Student s2 = new Student(3,"mrunal","PCCOE");

		service.addNew(e1);
		service.addNew(s1);
		service.addNew(s2);
		service.addNew(e2);
		
		return "successfully added..";
	}

	@RequestMapping("/find")
	public Person display() {
		return service.getById(2);
	}
	
	@RequestMapping("/delete")
	public String delete() {
		service.deleteById(101);
		
		return "successfully deleted";
	}

}
