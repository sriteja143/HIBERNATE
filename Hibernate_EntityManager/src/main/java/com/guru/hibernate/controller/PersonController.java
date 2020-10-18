package com.guru.hibernate.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.guru.hibernate.pojo.Person;
import com.guru.hibernate.repository.PersonRepository;

@RestController
public class PersonController {

	@Autowired PersonRepository personRepository;

	@GetMapping(value = "/all")
	public Person getpersons(){
		System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<");
		 Person result = personRepository.findById(10001L);
		 System.out.println(Arrays.asList(result));
		 return result;
		
	}
	/*
	 * @GetMapping(value = "/persion/{id}") public Person
	 * getpersons(@PathVariable("id") String id){
	 * System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<< id is "+ id);
	 * Integer i=Integer.valueOf(id);
	 * System.out.println(">>>>>>>>>>>>>>>>>>> id <<<<<<<<<<<<<<<<<<<<< id is "+
	 * id); Person result = personRepository.findById(i);
	 * System.out.println(Arrays.asList(result)); return result;
	 * 
	 * }
	 * 
	 * @PostMapping(value = "/{id}") public int update(@RequestBody Person person){
	 * System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<< id is "+
	 * person.id); int result = personRepository.update(person);
	 * System.out.println(Arrays.asList(result)); return result;
	 * 
	 * }
	 * 
	 * @GetMapping(value = "/update") public int update(){
	 * 
	 * Person p = new Person(10004, "SRI", "AP", new Date());
	 * System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<< id is "+ p.id);
	 * int result = personRepository.update(p);
	 * System.out.println(Arrays.asList(result)); return result;
	 * 
	 * }
	 */
	
}
