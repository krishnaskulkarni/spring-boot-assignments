package com.capgemini.demoinheritancemapping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.demoinheritancemapping.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person,Integer>{
		
}
