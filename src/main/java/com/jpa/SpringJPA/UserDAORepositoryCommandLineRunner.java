package com.jpa.SpringJPA;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.jpa.SpringJPA.entity.User;
import com.jpa.SpringJPA.repository.UserRepository;

@Component
@Order(1)
public class UserDAORepositoryCommandLineRunner implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(UserDAORepositoryCommandLineRunner.class);
	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Amrendra","Admin");
		userRepository.save(user);
		log.info("new user is created "+user);
		User user1 = new User("Raman","User");
		userRepository.save(user1);
		log.info("new user is created "+user1);
		
		Optional<User> userWithIdOne = userRepository.findById(3L);
		log.info("user is retrieved " + userWithIdOne.orElse(null));
		
		List<User> users = userRepository.getAllUser();
		log.info("list of users " + users);
		
		List<User> users1 = userRepository.getUserUsingId(Arrays.asList(2L,3L));
		log.info("list of users via parameters" + user1);
		
		userRepository.customUpdateUser("khushbir", 3L);
		
//		userRepository.deleteById(2L);
	}
	

}
