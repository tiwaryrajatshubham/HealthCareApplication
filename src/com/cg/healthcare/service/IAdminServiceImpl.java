package com.cg.healthcare.service;

import com.cg.healthcare.dao.IAdminRepository;
import com.cg.healthcare.dao.IAdminRepositoryImpl;
import com.cg.healthcare.dao.UserRepository;
import com.cg.healthcare.dao.UserRepositoryImpl;

public class IAdminServiceImpl implements IAdminService {
private IAdminRepository dao;
	
	

	public IAdminServiceImpl() {
		dao = new IAdminRepositoryImpl();
		
	}

	@Override
	public void registerAdmin(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		
		try {
			dao.beginTransaction();
			dao.registerAdmin(username, password);
			System.out.println("Admin registration sucessfully");
			dao.commitTransaction();
		
			
		} catch (Exception e) {
			System.out.println("Could not add admin due to " + e);
		
	}

}
}