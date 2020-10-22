package com.cg.healthcare.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.cg.healthcare.dao.UserRepositoryImpl;
import com.cg.healthcare.entities.User;
import com.cg.healthcare.service.IUserServiceImpl;

class IUserServiceImplTest {

	/*@Test
	void testValidAddUser() {
		User userObj=new User();
		userObj.setId(3);
		userObj.setUsername("Karan");
		userObj.setPassword("karan@");
		userObj.setRole("admin");
		try {
			assertEquals(userObj,new IUserServiceImpl().addUser(userObj));		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}*/
	/*@Test
	void testInValidAddUser() {
		User userObj=new User();
		userObj.setId(10);
		userObj.setUsername("raj");
		userObj.setPassword("raj@");
		userObj.setRole("Patient");
		try {
			assertEquals(null,new IUserServiceImpl().addUser(userObj));		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	/*@Test
	void testValidRemoveUser() {
		User userObj=new User();
		userObj.setId(2);
		userObj.setUsername("raj");
		userObj.setPassword("raj@");
		userObj.setRole("Patient");
		try {
			assertEquals(userObj,new IUserServiceImpl().removeUser(userObj));		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	@Test
	void testInvalidRemoveUser() {
		IUserServiceImpl obj=new IUserServiceImpl();
		User userObj=new User();
		userObj.setId(124);
		userObj.setUsername("raj");
		userObj.setPassword("raj@");
		userObj.setRole("admin");
		assertEquals(null,new IUserServiceImpl().removeUser(userObj));
		
		
		
	}*/

}
