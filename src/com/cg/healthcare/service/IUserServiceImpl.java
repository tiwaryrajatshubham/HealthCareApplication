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
		return null;
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
