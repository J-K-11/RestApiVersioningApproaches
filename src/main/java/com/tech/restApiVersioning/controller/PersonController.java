package com.tech.restApiVersioning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tech.restApiVersioning.entity.Person;
import com.tech.restApiVersioning.repository.PersonRepository;
/**
 * 
 * @author jasleen.khurana
 * 
 * The controller describes different approaches that can be used for versioning of APIs 
 * There are basically 4 approaches to it
 * 1) URI path based versioning [Twitter]
 * 2) Query parameters based versioning [Amazon]
 * 3) Custom HTTP headers based versioning [Microsoft]
 * 4) Content negotiation/ mime/ media type versioning [Github]
 */
@RestController
public class PersonController {
	
	@Autowired
	private PersonRepository personRepository;
	
	//URI based versioning[twitter]
	
	@RequestMapping(value="/v1/person", method=RequestMethod.GET)
	public Person uriV1(){
		return personRepository.findByName("jasleen");
	}
	
	
	@RequestMapping(value="/v2/person", method=RequestMethod.GET)
	public Person uriV2(){
		return personRepository.findById(2);
	}
	
	
	//request param based versioning[amazon]
	
	@RequestMapping(value="/person", params="Version=1",  method=RequestMethod.GET)
	public Person paramaV1(){
		return personRepository.findByName("jasleen");
	}
	
	
	@RequestMapping(value="/person", params="Version=2", method=RequestMethod.GET)
	public Person paramV2(){
		return personRepository.findById(2);
	}
	
	//header based versioning [microsoft]
	
	@RequestMapping(value="/person", headers="X-API-Version=1",  method=RequestMethod.GET)
	public Person headerV1(){
		return personRepository.findByName("jasleen");
	}
	
	
	@RequestMapping(value="/person", headers="X-API-Version=2", method=RequestMethod.GET)
	public Person headerV2(){
		return personRepository.findById(2);
	}
	
	//mime/media type or content negotiation based versioning [github]
	
	@RequestMapping(value="/person", produces="application/vnd.tech.v1+json",  method=RequestMethod.GET)
	public Person producesV1(){
		return personRepository.findByName("jasleen");
	}
	
	
	@RequestMapping(value="/person", produces="application/vnd.tech.v2+json", method=RequestMethod.GET)
	public Person producesV2(){
		return personRepository.findById(2);
	}
	
	
	
	
}
