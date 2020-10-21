package com.cg.healthcare.control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.healthcare.dao.UserRepositoryImpl;
import com.cg.healthcare.entities.User;

public class TestMain {
	public static void main(String args[]) {
		User obj=new User();
		UserRepositoryImpl obj1=new UserRepositoryImpl();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA");
		EntityManager obj2=factory.createEntityManager();
		obj=obj2.find(User.class,1);
		System.out.println(obj.toString());
		
	}

}
