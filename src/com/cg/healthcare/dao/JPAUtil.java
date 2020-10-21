package com.cg.healthcare.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	
	static {
		try {
		factory = Persistence.createEntityManagerFactory("JPA");
		}
		catch (Throwable ex){
			 throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static EntityManager getEntityManager() {
		if(entityManager==null || !entityManager.isOpen()) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}
	
}
