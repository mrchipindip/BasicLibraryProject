package com.cognizant;

import java.util.Date;

public class Newspapers extends Items{
	
	private int newsID;
	private String publisher;
	private Date pubDate;
	private boolean isOnLoan = false;
	
	public Newspapers(String pub, Date pubDate, boolean onLoan) 
	{
		numOfItems++;
		setNewsID(numOfItems);
		setPublisher(pub);
		setPubDate(pubDate);
		setOnLoan(onLoan);
		itemMap.put(newsID, this);

	}
	
	public Newspapers(String pub, Date pubDate) 
	{
		numOfItems++;
		setNewsID(numOfItems);
		setPublisher(pub);
		setPubDate(pubDate);
		itemMap.put(newsID, this);

	}
	
	public Newspapers(String pub, boolean onLoan) 
	{
		numOfItems++;
		setNewsID(numOfItems);
		setPublisher(pub);
		setOnLoan(onLoan);
		Date tempDate = new Date();
		setPubDate(tempDate);
		itemMap.put(newsID, this);

	}
	
	public Newspapers(String pub) 
	{
		numOfItems++;
		setNewsID(numOfItems);
		setPublisher(pub);
		Date tempDate = new Date();
		setPubDate(tempDate);
		itemMap.put(newsID, this);

	}
	
	public String toString()
	{
		return "ID: " + "N" + getNewsID() + "\r\n" + "Publisher: " + getPublisher() + "\r\n" + "Date of Publish: " + getPubDate() + "\r\n" + "Currently on loan: " + isOnLoan();
	}
	
	public String getType()
	{
		return "NEWS";
	}
	
	public int loanTime()
	{
		return 2;
	}



	public boolean isOnLoan() {
		return isOnLoan;
	}



	public void setOnLoan(boolean isOnLoan) {
		this.isOnLoan = isOnLoan;
	}



	public Date getPubDate() {
		return pubDate;
	}



	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}



	public String getPublisher() {
		return publisher;
	}



	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}



	public int getNewsID() {
		return newsID;
	}



	public void setNewsID(int newsID) {
		this.newsID = newsID;
	}
	
}
