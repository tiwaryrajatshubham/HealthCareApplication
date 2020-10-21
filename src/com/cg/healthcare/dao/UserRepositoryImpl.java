package com.cg.healthcare.dao;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
		
		User usr=new User();
		Query q=entityManager.createNativeQuery("select * from users where username= :username and password= :password");
		q.setParameter("username",username);
		q.setParameter("password",password);
		List<User> l=q.getResultList();
		for(User u:l) {
			System.out.println(u);
		}
		return usr;
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

