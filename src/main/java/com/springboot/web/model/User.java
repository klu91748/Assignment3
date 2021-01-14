package com.springboot.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private String name;
	private String pass;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
