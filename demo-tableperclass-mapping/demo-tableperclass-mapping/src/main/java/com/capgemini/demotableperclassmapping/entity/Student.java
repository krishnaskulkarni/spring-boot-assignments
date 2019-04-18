package com.capgemini.demotableperclassmapping.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "student")
@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id")),
		@AttributeOverride(name = "name", column = @Column(name = "name")) })
public class Student extends Person {

	private String collage;

	public Student(int studentId, String collage) {
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
