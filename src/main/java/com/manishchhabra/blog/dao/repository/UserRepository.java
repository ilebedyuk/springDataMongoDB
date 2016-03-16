package com.manishchhabra.blog.dao.repository;

import com.manishchhabra.blog.dao.IUser;
import com.manishchhabra.blog.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author amakarov
 */
public interface UserRepository extends MongoRepository<Person, String>, IUser {
}
