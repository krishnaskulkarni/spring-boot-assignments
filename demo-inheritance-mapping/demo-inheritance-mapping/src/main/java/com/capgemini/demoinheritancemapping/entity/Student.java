package com.capgemini.demoinheritancemapping.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="student")  
public class Student extends Person {

	
	private String collage;

	public Student( String collage) {
		super();
		
		this.collage = collage;
	}

	
	
	public Student(int personId, String personName, String collage) {
		super(personId, personName);
		
		this.collage = collage;
	}



	public Student() {
		super();
	}



	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}

	@Override
	public String toString() {
		return "Student [ collage=" + collage + "]";
	}
	

}
