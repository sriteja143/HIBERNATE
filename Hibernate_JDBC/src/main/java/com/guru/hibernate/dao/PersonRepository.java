package com.guru.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.guru.hibernate.entity.Person;

@Repository
public class PersonRepository {
	
	@Autowired JdbcTemplate jdbcTemplate;
	
	
	
	public List<Person> findAll(){
		return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public Person findById(Integer id){
		return jdbcTemplate.queryForObject("select * from person where id=?", new Object[] { id },new BeanPropertyRowMapper<Person>(Person.class));
	}

	public int update(Person p){
		return jdbcTemplate.update("insert into person (id , name ,location ,brith_date) values(?,?,?,?)", new Object[] { p.id ,p.name ,p.location ,p.brith_date });
	}
}
