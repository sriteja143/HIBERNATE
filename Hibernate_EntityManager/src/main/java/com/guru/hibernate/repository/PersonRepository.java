package com.guru.hibernate.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.guru.hibernate.pojo.Person;

@Repository
public class PersonRepository {
	
	@Autowired JdbcTemplate jdbcTemplate;
	
	@Autowired EntityManager em;
	
	public Person findById(Long id){
		
		return em.find(Person.class, id);
	}
	
	/*
	 * public Person findById(Integer id){ return
	 * jdbcTemplate.queryForObject("select * from person where id=?", new Object[] {
	 * id },new BeanPropertyRowMapper<Person>(Person.class)); }
	 */

	public int update(Person p){
		return jdbcTemplate.update("insert into person (id , name ,location ,brith_date) values(?,?,?,?)", new Object[] { p.id ,p.name ,p.location ,p.brith_date });
	}
}
