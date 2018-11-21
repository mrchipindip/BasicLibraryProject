package com.cognizant;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LibraryMapTests {

	int idBefore = Items.numOfItems;
	static Maps testMap = new Maps("Albania", 3, false);
	static Maps testMap2 = new Maps("Jordan", 1);
	
	@Test
	public void idIncrementMapTest() 
	{
		assertEquals("Id Increment Test", idBefore, Maps.numOfItems);
	}
	
	@Test
	public void mapConstructorCheck() 
	{
		assertEquals("MapID Check", 1, testMap.getMapID());
	}
	
	@Test
	public void mapConstructorLocCheck()
	{
		assertEquals("Location Check", "Albania", testMap.getLocation());
	}
	
	@Test
	public void mapConstructorLoanCheck()
	{
		assertEquals("on loan check", false, testMap.isOnLoan());
	}
	
	@Test
	public void secondMapConstructorCheck()
	{
		assertEquals("Non passed param check", false, testMap2.isOnLoan());
	}
}
