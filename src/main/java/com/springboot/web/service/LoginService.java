package com.springboot.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.web.dao.UserDAO;
import com.springboot.web.model.User;

@Service
public class LoginService {

	@Autowired
	UserDAO userDao;
	
	public boolean validateUser(String name, String pass) {        
		User user = userDao.findOne(name);
		return user.getName().equals(name) && user.getPass().equals(pass);
	}

}
