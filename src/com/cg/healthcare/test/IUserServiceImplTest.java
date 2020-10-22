package com.cg.healthcare.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.healthcare.dao.UserRepositoryImpl;
import com.cg.healthcare.entities.User;
import com.cg.healthcare.service.IUserServiceImpl;

class IUserServiceImplTest {

	@Test
	void testAddUser() {
		User userObj=new User();
		userObj.setId(3);
		userObj.setUsername("rohan");
		userObj.setPassword("rohan@");
		userObj.setRole("Patient");
		try {
			assertEquals(userObj,new IUserServiceImpl().addUser(userObj));		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
