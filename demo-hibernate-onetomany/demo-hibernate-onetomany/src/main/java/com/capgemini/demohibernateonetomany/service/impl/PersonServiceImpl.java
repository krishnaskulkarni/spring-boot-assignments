package com.capgemini.demohibernateonetomany.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.demohibernateonetomany.dao.PersonDao;
import com.capgemini.demohibernateonetomany.entity.Person;
import com.capgemini.demohibernateonetomany.service.PersonService;


@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao dao;
	
	@Override
	public void addNew(Person person) {
			dao.save(person);
	}

	@Override
	public Person findById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(int id) {
		dao.deleteById(id);
	}	

}
