package com.capgemini.demohibernateonetoone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Profile {

	@Id
	private int profileId;
	private String name;

	@OneToOne
	@JoinColumn(name = "personId")
	private Person person;

	public Profile(int profileId, String name) {
		super();
		this.profileId = profileId;
		this.name = name;
		
	}

	public Profile(int profileId, String name, Person person) {
		super();
		this.profileId = profileId;
		this.name = name;
		this.person = person;
	}

	public Profile() {
		super();
	}

	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", name=" + name + ", person=" + person + "]";
	}

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
