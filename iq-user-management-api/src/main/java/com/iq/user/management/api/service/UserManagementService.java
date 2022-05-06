package com.iq.user.management.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.iq.user.management.api.bean.Customer;
import com.iq.user.management.api.repository.UserManagementDao;

/** The class UserManagementService*/
public class UserManagementService {
	
	@Autowired
	private UserManagementDao userManagementDao;
	public List<Customer> getUser() {
		return userManagementDao.getUser();
	}
}
