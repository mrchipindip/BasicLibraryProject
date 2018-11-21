package com.cognizant;

public class Staff extends People{
	
	private double salary = 0d;
	private boolean permissions;
	
	public Staff(String name, String username, String password, double salary)
	{
		super(name, username, password);
		this.setSalary(salary);
		setPermissions(false);
	}
	
	public Staff(String name, String username, String password, double salary, boolean permissions)
	{
		super(name, username, password);
		this.setSalary(salary);
		setPermissions(permissions);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isPermissions() {
		return permissions;
	}

	public void setPermissions(boolean permissions) {
		this.permissions = permissions;
	}
	
}
