package com.capgemini.democoncretclassmapping.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.democoncretclassmapping.dao.PersonDao;
import com.capgemini.democoncretclassmapping.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao dao;

	@Override
	public void addNew(Person person) {
		dao.save(person);
	}

	@Override
	public Person getById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
	}

}
