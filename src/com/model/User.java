package com.model;

import java.io.Serializable;

public class User implements Serializable{
	private String name;
	private String addr;
	
	public User() {
		super();
	}
	public User(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

}
