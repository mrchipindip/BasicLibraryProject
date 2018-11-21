package com.cognizant;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Book booky = new Book("Chippy", false, 54,"the great robbery");
		
		//System.out.println(booky.toString());
		ArrayList<Book> bookList = new ArrayList<Book>();
		ArrayList<Maps> mapList = new ArrayList<Maps>();
		ArrayList<Newspapers> newsList = new ArrayList<Newspapers>();
		
		HashMap<Integer, String> itemMap = new HashMap<Integer, String>();
		
		
	}
	
	public void saveToFile(ArrayList<Book> bookList, ArrayList<Maps> mapList, ArrayList<Newspapers> newsList)
	{
		
	}
	
	//default List populations for testing purposes
	public void populateBookList(ArrayList<Book> bookList, HashMap<Integer, String> itemMap)
	{
		Book tempBook = new Book("Chris", false, 50, "Java for Dummies");
		Book tempBook2 = new Book("Chris", true, 35, "Java for Experts");
		Book tempBook3 = new Book("Chester", false, 100, "Why TDD is Bad");
		Book tempBook4 = new Book("Josh", false, 67, "Maths for 8 Year Olds");
		Book tempBook5 = new Book("Chester", false, 70, "Beards and there many uses");
		bookList.add(tempBook);
		itemMap.put(tempBook.getBookID(), "BOOK");
		bookList.add(tempBook2);
		itemMap.put(tempBook2.getBookID(), "BOOK");
		bookList.add(tempBook3);
		itemMap.put(tempBook3.getBookID(), "BOOK");
		bookList.add(tempBook4);
		itemMap.put(tempBook4.getBookID(), "BOOK");
		bookList.add(tempBook5);
		itemMap.put(tempBook5.getBookID(), "BOOK");
	
	}
	
	public void populateMapList(ArrayList<Maps> mapList, HashMap<Integer, String> itemMap)
	{
		Maps tempMap = new Maps("Albania", 4, false);
		Maps tempMap2 = new Maps("Lithuania", 1, false);
		Maps tempMap3 = new Maps("Germany", 2, false);
		Maps tempMap4 = new Maps("France", 11, false);
		Maps tempMap5 = new Maps("England", 4, true);
		mapList.add(tempMap);
		itemMap.put(tempMap.getMapID(), "MAP");
		mapList.add(tempMap2);
		itemMap.put(tempMap2.getMapID(), "MAP");
		mapList.add(tempMap3);
		itemMap.put(tempMap3.getMapID(), "MAP");
		mapList.add(tempMap4);
		itemMap.put(tempMap4.getMapID(), "MAP");
		mapList.add(tempMap5);
		itemMap.put(tempMap5.getMapID(), "MAP");
	}
	
	public void populateNewsList(ArrayList<Newspapers> newsList, HashMap<Integer, String> itemMap)
	{
		Date tempDate = new Date();
		Newspapers tempNews = new Newspapers("Daily Mail", tempDate, false);
		Date tempDate2 = new Date(2012, 10, 12);
		Newspapers tempNews2 = new Newspapers("Daily Mail", tempDate2, false);
		Date tempDate3 = new Date(1998, 4, 22);
		Newspapers tempNews3 = new Newspapers("Daily Mail", tempDate3, false);
		Date tempDate4 = new Date(2008, 8, 16);
		Newspapers tempNews4 = new Newspapers("Daily Mail", tempDate4, false);
		Date tempDate5 = new Date(2001, 4, 11);
		Newspapers tempNews5 = new Newspapers("Daily Mail", tempDate5, false);
		newsList.add(tempNews);	
		itemMap.put(tempNews.getNewsID(), "NEWSPAPER");
		newsList.add(tempNews2);		
		itemMap.put(tempNews2.getNewsID(), "NEWSPAPER");
		newsList.add(tempNews3);	
		itemMap.put(tempNews3.getNewsID(), "NEWSPAPER");
		newsList.add(tempNews4);	
		itemMap.put(tempNews4.getNewsID(), "NEWSPAPER");	
		newsList.add(tempNews5);	
		itemMap.put(tempNews5.getNewsID(), "NEWSPAPER");	
	}
	
	
}
