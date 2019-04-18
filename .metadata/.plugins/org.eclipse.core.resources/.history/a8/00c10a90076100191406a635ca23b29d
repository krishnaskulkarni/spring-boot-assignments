package com.capgemini.demohibernateonetoone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.demohibernateonetoone.dao.PersonDao;
import com.capgemini.demohibernateonetoone.entity.Person;
import com.capgemini.demohibernateonetoone.service.PersonService;


@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao dao;
	
	@Override
	public void addNew(Person person) {
			dao.save(person);
	}

}
