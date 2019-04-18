package com.capgemini.demohibernateonetoone.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "person")
public class Person {

	@Id
	private int personId;
	private String personName;
	
	
	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
	private Profile profile;


	public Person(int personId, String personName, Profile profile) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.profile = profile;
	}


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", profile=" + profile + "]";
	}


	public int getPersonId() {
		return personId;
	}


	public void setPersonId(int personId) {
		this.personId = personId;
	}


	public String getPersonName() {
		return personName;
	}


	public void setPersonName(String personName) {
		this.personName = personName;
	}


	public Profile getProfile() {
		return profile;
	}


	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	

}
