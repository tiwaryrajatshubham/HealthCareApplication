/**
* The IAdminRepositoryImpl is an implementation of IAdminRepository interface  that
* performs operations related to registration of user.
* 
* @author  Tiwary Rajat Shubham
* @version 1.0
* @since   2020-10-21 
*/
package com.cg.healthcare.dao;

import java.util.Random;

import javax.persistence.EntityManager;

import com.cg.healthcare.entities.User;

public class IAdminRepositoryImpl implements IAdminRepository {
	private EntityManager entityManager;

	public IAdminRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	// Method that register a user as admin in the database.
	@Override
	public void registerAdmin(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		int id = random.nextInt();
		User userObj = new User();
		userObj.setId(id);
		userObj.setUsername(username);
		userObj.setPassword(password);
		userObj.setRole("admin");
		try {
			entityManager.persist(userObj);
		} catch (Exception e) {
			{
				System.out.println("Registration Unsuccessful " + e);
			}

		}

	}

	// Method for starting transaction
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
	}

	// Method for transaction commit
	public void commitTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
	}

}
