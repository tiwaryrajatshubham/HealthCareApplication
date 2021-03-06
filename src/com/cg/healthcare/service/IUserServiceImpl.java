/**
* The IUserServiceImpl program is an implementation of UserService interface that
* performs user related operations.
*
* @author  Tiwary Rajat Shubham
* @version 1.0
* @since   2020-10-21 
*/

package com.cg.healthcare.service;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.cg.healthcare.dao.JPAUtil;
import com.cg.healthcare.dao.UserRepository;
import com.cg.healthcare.dao.UserRepositoryImpl;
import com.cg.healthcare.entities.User;

public class IUserServiceImpl implements IUserService {
	private UserRepositoryImpl dao;

	public IUserServiceImpl() {
		dao = new UserRepositoryImpl();

	}

	// Method to check whether a user is valid or not based on username and password
	@Override
	public User validateUser(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		try {
			dao.validateUser(username, password);
		} catch (Exception e) {
			System.out.println(e);

		}
		return null;
	}

	// Method to add a user object to database
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub

		try {
			dao.addUser(user);
			System.out.println("User added sucessfully");

		} catch (Exception e) {
			System.out.println("Could not add user due to " + e);
			user=null;
		}
		

		return user;
	}

	// Method to remove a user from database
	@Override
	public User removeUser(User user) {
		// TODO Auto-generated method stub
		try {
			dao.removeUser(user);
			System.out.println("User deleted sucessfully");

		} catch (Exception e) {
			System.out.println("Could not delete user due to "+e);
			user=null;
		}
		return user;
	}

}
