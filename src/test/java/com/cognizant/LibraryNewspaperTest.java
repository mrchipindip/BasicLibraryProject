package com.cognizant;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import org.junit.Test;

public class LibraryNewspaperTest {

	int idBefore = Items.numOfItems;
	static Date tempDate = new Date(2012, 10, 12);
	static Newspapers newspaper1 = new Newspapers("Daily Mail", tempDate, false);
	
	@Test
	public void idIncrementMapIDTest()
	{
		assertEquals("Id Increment Test", idBefore, Newspapers.numOfItems);
	}
	
	@Test
	public void newspaperConstructorCheckPub() 
	{
		assertEquals("Publisher check", "Daily Mail", newspaper1.getPublisher());
	}
	
	@Test
	public void newsConCheckDate()
	{
		assertEquals("Date Check", tempDate, newspaper1.getPubDate());
	}
	
	@Test
	public void newsConCheckOnLoan()
	{
		assertEquals("OnLoan Checked", false, newspaper1.isOnLoan());
	}
	
	@Test
	public void newsToStringCheck()
	{
		assertEquals("Check output of the toString method within newspaper", "ID: N1\r\nPublisher: Daily Mail\r\nDate of Publish: Tue Nov 12 00:00:00 GMT 3912\r\nCurrently on loan: false", newspaper1.toString());
	}
	
	@Test 
	public void newsLoanTimeCheck()
	{
		assertEquals("Check to see correct loan time is returned", 2, newspaper1.loanTime());
	}
	
}
