package com.capgemini.demoinheritancemapping.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="employee")  
public class Employee extends Person {

	private String company;


	public Employee() {
		super();

	}
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Employee(int personId, String personName, String company) {
		super(personId, personName);
		this.company = company;
	}


	public Employee(int personId, String personName) {
		super(personId, personName);

	}

	@Override
	public String toString() {
		return "Employee [ +company=" + company + "]";
	}

	
}
