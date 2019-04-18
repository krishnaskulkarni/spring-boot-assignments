package com.capgemini.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.demo.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person,Integer>{
		
}
