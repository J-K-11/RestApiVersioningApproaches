package com.tech.restApiVersioning.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * 
 * @author jasleen.khurana
 *
 */
@Entity
public class Person {
	@Id
	private Integer id;
	private String name;
	private Integer age;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Person() {
		super();
	}
	
	
	public Person(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Person(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	

}
