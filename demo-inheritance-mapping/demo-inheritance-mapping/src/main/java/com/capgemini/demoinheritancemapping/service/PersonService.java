package com.capgemini.demoinheritancemapping.service;

import com.capgemini.demoinheritancemapping.entity.Person;

public interface PersonService {
		public void addNew(Person person);

		public Person getById(int i);

		public void deleteById(int i);
}
