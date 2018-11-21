package com.cognizant;

public class Maps extends Items{

	private int mapID;
	private String location;
	private int numOfRedCrosses;
	private boolean isOnLoan = false;
	
	public Maps(String paramLocation, int paramCrosses, boolean onLoan)
	{
		numOfItems++;
		setMapID(numOfItems);
		setLocation(paramLocation);
		setNumOfRedCrosses(paramCrosses);
		setOnLoan(onLoan);
		itemMap.put(mapID, this);

		
	}
	
	public Maps(String paramLocation, int paramCrosses)
	{
		numOfItems++;
		setMapID(numOfItems);
		setLocation(paramLocation);
		setNumOfRedCrosses(paramCrosses);
		setOnLoan(false);
		itemMap.put(mapID, this);

		
	}
	
	public int loanTime()
	{
		//in weeks
		return 1;
	}
	
	public String getType()
	{
		return "MAP";
	}
	
	public String toString()
	{
		String temp = "ID: " + "M" + getMapID() + "\r\n" + "Location: " + getLocation() + "\r\n" + "Num Of Red Crosses: " + getNumOfRedCrosses();
		return temp;
	}

	public int getMapID() {
		return mapID;
	}

	public void setMapID(int mapID) {
		this.mapID = mapID;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNumOfRedCrosses() {
		return numOfRedCrosses;
	}

	public void setNumOfRedCrosses(int numOfRedCrosses) {
		this.numOfRedCrosses = numOfRedCrosses;
	}

	public boolean isOnLoan() {
		return isOnLoan;
	}

	public void setOnLoan(boolean isOnLoan) {
		this.isOnLoan = isOnLoan;
	}
	
	
}
