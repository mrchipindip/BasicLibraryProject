package com.cognizant;

import java.util.HashMap;

public abstract class Items {

	public static int numOfItems = 0;
	
	public abstract int loanTime();
	public abstract String getType();
	
	public static HashMap<Integer, Items> itemMap = new HashMap<Integer, Items>();
	
}
