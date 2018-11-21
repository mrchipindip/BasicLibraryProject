package com.cognizant;

public class People {
	
	private String username ="";
	private String password = "";
	private String name;
	
	public People(String name, String username, String password)
	{
		setName(name);
		setUsername(username);
		setPassword(password);
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
