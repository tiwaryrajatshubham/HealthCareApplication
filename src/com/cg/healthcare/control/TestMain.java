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
		User obj=new User();
		
		obj.setPassword("rohan@");
		obj.setRole("admin");
		obj.setId(1);
		obj.setUsername("rohan");
		//User obj3=new User();
		IUserServiceImpl obj1=new IUserServiceImpl();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA");
		//EntityManager obj2=factory.createEntityManager();
		//obj=obj2.find(User.class,1);
		//System.out.println(obj.toString());
		/*User usr=new User();
		Query q=obj2.createNativeQuery("select * from users where username= :username and password= :password");
		q.setParameter("username","rajat");
		q.setParameter("password","shubham@");
		Object[]  us=(Object[]) q.getSingleResult();
		for(Object u:us) {
			System.out.println(u);
		}*/
		IAdminServiceImpl impl=new IAdminServiceImpl();
		
		User userObj=new User();
		userObj.setId(8);
		userObj.setUsername("raj");
		userObj.setPassword("raj@");
		userObj.setRole("admin");
		IUserServiceImpl objusi=new IUserServiceImpl();
		try {
	//objusi.validateUser("rohan","rohan@");
	//objusi.removeUser(userObj);
			//objusi.addUser(userObj);
			impl.registerAdmin("aman","aman@");
			
		}
		catch(Exception e) {
			
		}
		
		
}
}

