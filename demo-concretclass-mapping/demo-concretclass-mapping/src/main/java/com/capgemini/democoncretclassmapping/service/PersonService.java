package com.capgemini.democoncretclassmapping.service;

import com.capgemini.democoncretclassmapping.entity.Person;

public interface PersonService {
		public void addNew(Person person);

		public Person getById(int i);

		public void deleteById(int i);
}
