package com.cognizant;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LibraryBookTests {
	
	int idBefore = Items.numOfItems;
	static Book booky2 = new Book();
    static Book booky3 = new Book("Jeremy", false, 46, "Woody");

    static Book booky4 = new Book("Jeremy", false, 46, "Woody");
//	Book booky4 = new Book("Jeremy", false, 46);
	
	@Test
	public void idIncrementTest()
	{
		assertEquals("Id Increment Test", idBefore , Book.numOfItems);
	}
	
	@Test
	public void getBookIDTest()
	{
		assertEquals("Book ID return check", 1, booky2.getBookID());
	}
	
	@Test
	public void bookConstructorCheck()
	{
		assertEquals("Book ID return check", 2, booky3.getBookID());
	}
	
	@Test
	public void bookConstructorCheck2()
	{
		assertEquals("Book Author Return", "Jeremy", booky3.getAuthor());
	}
	
	@Test
	public void bookConstructorCheck3()
	{
		assertEquals("Book onLoan Return", false, booky3.isOnLoan());
	}
	
	@Test
	public void checkToString()
	{
		String shouldEqual = "ID: B2\r\nName: Woody\r\nAuthor: Jeremy\r\nPages: 46\r\nBook currently on loan: false";
		assertEquals("Object Tostring output check", shouldEqual, booky3.toString());
	}
	@Test
	public void bookConstructorCheckRest()
	{
		assertEquals("Book page Return", 46, booky4.getPageLength());
		booky4.setAuthor("Borris");
		booky4.setOnLoan(true);
		booky4.setPageLength(50);
		assertEquals("Book page Set", 50, booky4.getPageLength());
		assertEquals("Book loan Set", true, booky4.isOnLoan());
		assertEquals("Book Author Set", "Borris", booky4.getAuthor());
	}
//	@Test
//	public void bookConstructor2Check()
//	{
//		assertEquals("Book ID return check", 3, booky4.getBookID());
//	}
	
}

