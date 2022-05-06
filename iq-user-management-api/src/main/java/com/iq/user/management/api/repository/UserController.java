package com.iq.user.management.api.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	UserManagementDao dao;
	@GetMapping("/user")
	public String getUser() {
		 dao.getUser();
		 return "Sucess"
;	}
	
}
