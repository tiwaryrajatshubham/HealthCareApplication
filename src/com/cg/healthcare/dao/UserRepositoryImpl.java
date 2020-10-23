/**
* The UserRepositoryImpl is an implementation of UserRepository Interface  that
* performs user related operations.
* 
* @author  Tiwary Rajat Shubham
* @version 1.0
* @since   2020-10-21 
*/
package com.cg.healthcare.dao;

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

	// Method to check whether a user is valid or not based on username and password
	@Override
	public User validateUser(String username, String password) throws Exception {
		// TODO Auto-generated method stub

		try {
			Query q = entityManager
					.createNativeQuery("select * from users where username= :username and password= :password");
			q.setParameter("username", username);
			q.setParameter("password", password);
			Object[] userObj = (Object[]) q.getSingleResult();

			if (userObj != null) {
				for (Object u : userObj) {
					System.out.print(u + " ");
				}
				System.out.println("is a valid user");
			} else
				throw new Exception();
		} catch (Exception e) {
			System.out.println("User not valid " + e);
		}

		return null;
	}

	// Method to add a user object to database
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		EntityManager eManager = JPAUtil.getEntityManager();
		eManager.getTransaction().begin();
		eManager.persist(user);
		eManager.getTransaction().commit();
		return user;
	}

	// Method to remove a user from database
	@Override
	public User removeUser(User user) {
		// TODO Auto-generated method stub
		EntityManager em = JPAUtil.getEntityManager();
		User userObj = em.find(User.class, user.getId());
		em.getTransaction().begin();
		em.remove(userObj);
		em.getTransaction().commit();
		return user;
	}

	// Method for starting transaction
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	// Method for transaction commit
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

}
