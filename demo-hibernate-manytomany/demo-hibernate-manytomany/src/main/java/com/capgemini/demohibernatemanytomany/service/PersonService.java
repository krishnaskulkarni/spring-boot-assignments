package com.capgemini.demohibernatemanytomany.service;

import java.util.List;
import java.util.Set;

import com.capgemini.demohibernatemanytomany.entity.Person;

public interface PersonService {
		public void addNew(Set<Person> persons);

		public Person findById(int i);

		public List<Person> findAll();
}
