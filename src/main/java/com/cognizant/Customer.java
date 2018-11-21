package com.cognizant;

import java.util.ArrayList;

public class Customer extends People{

	private ArrayList<Items> itemsBorrowed;
	private String email;
	private boolean itemOverdue;
	
	public Customer(String name, String username, String password, String email)
	{
		super(name, username, password);
		setEmail(email);
		itemOverdue = false;
		itemsBorrowed = new ArrayList<Items>();
		
	}
	
	public Customer(String name, String username, String password, String email, boolean itemOverdue)
	{
		super(name, username, password);
		setEmail(email);
		setItemOverdue(itemOverdue);
		itemsBorrowed = new ArrayList<Items>();
		
	}
	
	public Customer(String name, String username, String password, String email, boolean itemOverdue, ArrayList<Items> paramList)
	{
		super(name, username, password);
		setEmail(email);
		setItemOverdue(itemOverdue);
		itemsBorrowed = paramList;
		
	}

	public ArrayList<Items> getItemsBorrowed() {
		return itemsBorrowed;
	}

	public void setItemsBorrowed(ArrayList<Items> itemsBorrowed) {
		this.itemsBorrowed = itemsBorrowed;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isItemOverdue() {
		return itemOverdue;
	}

	public void setItemOverdue(boolean itemOverdue) {
		this.itemOverdue = itemOverdue;
	}
}
