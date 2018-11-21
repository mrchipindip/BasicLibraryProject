package com.cognizant;


public class Book extends Items {
	
	public static int numOfBooks = 0;
	private int bookID;
	private String name;
	private String author;
	private boolean isOnLoan = false;
	private int pageLength;
	
	public Book()
	{
		//numOfBooks++;
		numOfItems++;
		setBookID(numOfItems);
	
	}
	
	public Book(String author, boolean onLoan, int pageLength, String name)
	{
		numOfItems++;
		setBookID(numOfItems);
		setAuthor(author);
		setOnLoan(onLoan);
		this.setPageLength(pageLength);
		setName(name);
		itemMap.put(bookID, this);
	}
	
	public String toString()
	{
		String temp;
		temp = "ID: " + "B" + getBookID() + "\r\n" + "Name: " + getName() + "\r\n" + "Author: " + getAuthor() + "\r\n" + "Pages: " + getPageLength() + "\r\n"  + "Book currently on loan: " + isOnLoan();
		return temp;
		
	}
	
	
	public int loanTime()
	{
		//in weeks
		return 4;
	}
	
	public String getType()
	{
		return "BOOK";
	}

	public String getName()
	{
		return name;
	}
	 public void setName(String paramName)
	 {
		 name = paramName;
	 }

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isOnLoan() {
		return isOnLoan;
	}

	public void setOnLoan(boolean isOnLoan) {
		this.isOnLoan = isOnLoan;
	}

	public int getPageLength() {
		return pageLength;
	}

	public void setPageLength(int pageLength) {
		this.pageLength = pageLength;
	}
	
	
}
