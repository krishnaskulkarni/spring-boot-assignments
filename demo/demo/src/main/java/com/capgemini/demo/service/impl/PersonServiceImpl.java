package com.capgemini.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.demo.dao.PersonDao;
import com.capgemini.demo.entity.Person;
import com.capgemini.demo.service.PersonService;


@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao dao;
	
	@Override
	public void addNew(Person person) {
			dao.save(person);
	}

}
