package com.tech.restApiVersioning.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tech.restApiVersioning.entity.Person;

/**
 * 
 * @author jasleen.khurana
 *
 */
public interface PersonRepository extends CrudRepository<Person, Integer>{
	
	public Person findByName(@Param("name") String name);
	public Person findById(@Param("id") Integer id);


}
