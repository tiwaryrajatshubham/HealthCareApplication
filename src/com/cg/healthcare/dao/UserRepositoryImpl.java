package com.cg.healthcare.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.healthcare.entities.User;
import com.cg.healthcare.dao.JPAUtil;
import com.cg.healthcare.dao.UserRepository;

public class UserRepositoryImpl implements UserRepository {
	private EntityManager entityManager;

	public UserRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}


	@Override
	public User validateUser(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		entityManager.persist(user);		
		return user;
	}

	@Override
	public User removeUser(User user) {
		// TODO Auto-generated method stub
		entityManager.remove(user);
		return user;
	}
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}
	
	
}

