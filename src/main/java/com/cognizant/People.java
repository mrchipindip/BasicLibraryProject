package com.cognizant;

import java.util.HashMap;

public class People {
	
	public static HashMap<Integer, People> peopleMap = new HashMap<Integer, People>();
	private static int peopleNum=0;
	private String username ="";
	private String password = "";
	private String name;
	
	public People(String name, String username, String password)
	{
		peopleNum++;
		setName(name);
		setUsername(username);
		setPassword(password);
		peopleMap.put(peopleNum, this);
	}
	
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
