package com.cg.healthcare.control;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.healthcare.dao.UserRepositoryImpl;
import com.cg.healthcare.entities.User;
import com.cg.healthcare.service.*;
public class TestMain {
	public static void main(String args[]) {
		User userObj=new User();
		userObj.setPassword("rohan");
		userObj.setRole("admin");
		userObj.setId(1);
		userObj.setUsername("rohan@");
		IUserServiceImpl iUserServiceImplObj=new IUserServiceImpl();
		IAdminServiceImpl iAdminServiceImplObj=new IAdminServiceImpl();
		try {
			//iUserServiceImplObj.validateUser("rajat","rajat@");
			//iUserServiceImplObj.removeUser(userObj);
			//iUserServiceImplObj.addUser(userObj);
			//iAdminServiceImplObj.registerAdmin("John","john@");
			
		}
		catch(Exception e) {
			
		}
		
		
}
}

