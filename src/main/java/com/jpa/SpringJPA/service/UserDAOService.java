package com.jpa.SpringJPA.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.jpa.SpringJPA.entity.User;
@Repository
@Transactional//instead of using transaction on each method we define class level @Transactional
public class UserDAOService {

	@PersistenceContext//whichever entity is in persistant state(entityManager.persist(object)) are monitered by entitymanager
	private EntityManager entityManager;//deals with entities like storing retrieving
	
	public long insert(User user) {
		//save user
		//open transaction
		entityManager.persist(user);
		//close transaction
		return user.getId();
	}
}
