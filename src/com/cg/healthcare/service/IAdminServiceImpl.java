/**
* The IAdminServiceImpl is an implementation of IAdminService interface  that
* performs operations related to registration of user.
* 
* @author  Tiwary Rajat Shubham
* @version 1.0
* @since   2020-10-21 
*/
package com.cg.healthcare.service;

import com.cg.healthcare.dao.IAdminRepository;
import com.cg.healthcare.dao.IAdminRepositoryImpl;
import com.cg.healthcare.dao.UserRepository;
import com.cg.healthcare.dao.UserRepositoryImpl;

public class IAdminServiceImpl implements IAdminService {
	private IAdminRepositoryImpl dao;

	public IAdminServiceImpl() {
		dao = new IAdminRepositoryImpl();

	}

	// Method that register a user as admin.
	@Override
	public void registerAdmin(String username, String password) throws Exception {
		// TODO Auto-generated method stub

		try {
			dao.beginTransaction();
			dao.registerAdmin(username, password);
			System.out.println("Admin registration sucessfull");
			dao.commitTransaction();

		} catch (Exception e) {
			System.out.println("Could not add admin due to " + e);

		}

	}
}