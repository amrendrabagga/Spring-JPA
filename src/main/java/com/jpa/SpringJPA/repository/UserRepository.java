package com.jpa.SpringJPA.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpa.SpringJPA.entity.User;

//@NoRepositoryBean
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	String SELECT_QUERY = "select *from user";
	@Query(value="select *from user",nativeQuery = true)
	List<User> getAllUser();
	
	@Query(value="select *from user where id in(?1)",nativeQuery = true)
	List<User> getUserUsingId(List<Long> idList);
	
	@Transactional
	@Modifying//run executeUpdate or execute
	@Query(value="update user set name=?1 where id=?2",nativeQuery = true)
	public void customUpdateUser(String name,Long id); 
	
	
}
