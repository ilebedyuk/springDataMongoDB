package com.manishchhabra.blog.service;

import com.manishchhabra.blog.dao.IUser;
import com.manishchhabra.blog.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class PersonService {
	
//	@Autowired
//	private MongoTemplate mongoTemplate;
//
//	public static final String COLLECTION_NAME = "users";
//
//	public void addPerson(Person person) {
////		if (!mongoTemplate.collectionExists(Person.class)) {
////			mongoTemplate.createCollection(Person.class);
////		}
//		person.setId(UUID.randomUUID().toString());
//		mongoTemplate.insert(person, COLLECTION_NAME);
//	}
//
//	public List<Person> listPerson() {
//		return mongoTemplate.findAll(Person.class, COLLECTION_NAME);
//	}
//
//	public void deletePerson(Person person) {
//		mongoTemplate.remove(person, COLLECTION_NAME);
//	}
//
//	public void updatePerson(Person person) {
//		mongoTemplate.insert(person, COLLECTION_NAME);
//	}

	@Autowired
	private IUser iUser;

	public PersonService() {
	}

	public void addPerson(Person person) {
		person.setId(UUID.randomUUID().toString());
		iUser.save(person);
	}

	public List<Person> listPerson() {
		return iUser.findAll();
	}

	public void deletePerson(Person person) {
		iUser.delete(person);
	}

//	public void updatePerson(Person person) {
//		mongoTemplate.insert(person, COLLECTION_NAME);
//	}
}
