package com.springboot.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.web.dao.UserDAO;
import com.springboot.web.model.User;

@Service
public class RegisterService {

	@Autowired
	UserDAO userDao;
	
	public void register(String name, String pass) {
		User user = new User(name, pass);
		userDao.save(user);
	}

}
