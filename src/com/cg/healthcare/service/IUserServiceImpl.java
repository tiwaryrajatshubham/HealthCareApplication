package com.cg.healthcare.service;

import com.cg.healthcare.dao.UserRepository;
import com.cg.healthcare.dao.UserRepositoryImpl;
import com.cg.healthcare.entities.User;



public class IUserServiceImpl implements IUserService {
	private UserRepository dao;
	public IUserServiceImpl() {
		dao = new UserRepositoryImpl();
	}
	@Override
	public User validateUser(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		User usrobj1=new User();
	
		usrobj1=dao.validateUser(username, password);
		try {
		if(usrobj1!=null) {
			System.out.println("Valid User");
		}
		else {
			System.out.println("Invalid User");
		}
		}
		catch(Exception e) {
			System.out.println("Validation Exception "+e);
		}
	
		
		return usrobj1;
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User removeUser(User user) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeUser(user);
		dao.commitTransaction();
		return user;
	}
	
	

}
