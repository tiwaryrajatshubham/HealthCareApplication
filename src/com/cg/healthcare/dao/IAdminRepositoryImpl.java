package com.cg.healthcare.dao;

import java.util.Random;

import javax.persistence.EntityManager;

import com.cg.healthcare.entities.User;

public class IAdminRepositoryImpl implements IAdminRepository {
	private EntityManager entityManager;

	public IAdminRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public void registerAdmin(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		Random random=new Random();
		int id=random.nextInt();
		User userObj=new User();
		userObj.setId(id);
		userObj.setUsername(username);
		userObj.setPassword(password);
		userObj.setRole("admin");
		entityManager.persist(userObj);
		
		
		
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
	}

}
