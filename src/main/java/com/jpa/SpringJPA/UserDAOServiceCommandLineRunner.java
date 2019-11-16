package com.jpa.SpringJPA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.jpa.SpringJPA.entity.User;
import com.jpa.SpringJPA.service.UserDAOService;

@Component
@Order(2)
public class UserDAOServiceCommandLineRunner implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	@Autowired
	private UserDAOService userDAOService;
	@Override
	public void run(String... args) throws Exception {
//		User user = new User("asb","User");
//		long id = userDAOService.insert(user);
//		log.info("new user is created "+user);
		
	}
	

}
