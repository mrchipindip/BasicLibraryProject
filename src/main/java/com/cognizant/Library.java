package com.cognizant;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Book booky = new Book("Chippy", false, 54,"the great robbery");
//		Book booky2 = new Book("twerpppy", false, 54,"the great robbery");
//		System.out.println(Items.itemMap.get(2).toString());
		//System.out.println(booky.toString());
//		ArrayList<Book> bookList = new ArrayList<Book>();
//		ArrayList<Maps> mapList = new ArrayList<Maps>();
//		ArrayList<Newspapers> newsList = new ArrayList<Newspapers>();
//		
//		HashMap<Integer, String> itemMap = new HashMap<Integer, String>();
		
		
	}
	
	public void goExecute()
	{
	
		populateLibrary();
		
		for (int i =1; i < 15; i++)
		{
			System.out.println(Items.itemMap.get(i).toString());
			System.out.println("-");
		}
		
		saveToFile();
		
	}
	
	
	public void loadFromFile()
	{
		String fileNation = "";
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileNation)))
		{
			String sCurrentFileLine;
			while((sCurrentFileLine = br.readLine()) != null)
			{
				System.out.println(sCurrentFileLine);
				//split the string
				String[] splitInput = sCurrentFileLine.split(" ");
			
			}
		}
		catch(IOException e)
		{
			
		}
	}
	
	public void saveToFile()
	{

		if(!Items.itemMap.isEmpty())
		{	
			String tempBuilder = "";
			String fileLocation = "C:\\Users\\chipi\\Library.txt";
			
			Iterator<Entry<Integer, Items>> it = Items.itemMap.entrySet().iterator();
			while (it.hasNext())
			{
				Entry<Integer, Items> oneEntry = it.next();
				
				if (oneEntry.getValue().getType() == "BOOK")
				{
					tempBuilder = tempBuilder + oneEntry.getValue().toString();
				}
				else if (oneEntry.getValue().getType() == "NEWS")
				{
					tempBuilder = tempBuilder + oneEntry.getValue().toString();

				}
				else
				{
					tempBuilder = tempBuilder + oneEntry.getValue().toString();

				}
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileLocation)))
			{
				bw.write(tempBuilder + "\r\n");
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("No items currently in  the library to save");
		}
	}
	
	public void updateStaff(int perID, String name, String username, String password, double salary, boolean permissions)
	{
		People.peopleMap.get(perID).setName(name);
		People.peopleMap.get(perID).setUsername(username);
		People.peopleMap.get(perID).setPassword(password);
		Staff tempStaff = (Staff)People.peopleMap.get(perID);
		tempStaff.setSalary(salary);
		tempStaff.setPermissions(permissions);
	}
	
	public void updateItem()
	{
		
	}
	
	public void updateCustomer(int perID, String name, String username, String password, String email, boolean itemOverdue)
	{
		People.peopleMap.get(perID).setName(name);
		People.peopleMap.get(perID).setUsername(username);
		People.peopleMap.get(perID).setPassword(password);
		Customer tempCustomer = (Customer)People.peopleMap.get(perID);
		tempCustomer.setEmail(email);
		tempCustomer.setItemOverdue(itemOverdue);
	}
	
	public void removePerson(int perID)
	{
		People.peopleMap.remove(perID);
	}
	
	public void addStaff(String name, String username, String password, double salary, boolean permissions)
	{
		Staff newStaff = new Staff(name, username, password, salary, permissions);
	}
	
	public void addCustomer(String name, String username, String password, String email)
	{
		Customer newCustomer = new Customer(name, username, password, email);
	}
	
	public void removeItem(int itemID)
	{
		Items.itemMap.remove(itemID);
	}
	
	public void addBook(String author, int pageLength, String name)
	{
		Book newBook = new Book(author, false, pageLength, name);
	}
	
	public void addMap(String paramLocation, int paramCrosses)
	{
		Maps newMap = new Maps(paramLocation, paramCrosses);
	}
	
	public void addNewspaper(String pub, Date pubDate)
	{
		Newspapers newNews = new Newspapers(pub, pubDate);
	}
	
	public void populateLibrary()
	{
		Book tempBook = new Book("Chris", false, 50, "Java for Dummies");
		Book tempBook2 = new Book("Chris", true, 35, "Java for Experts");
		Book tempBook3 = new Book("Chester", false, 100, "Why TDD is Bad");
		Book tempBook4 = new Book("Josh", false, 67, "Maths for 8 Year Olds");
		Book tempBook5 = new Book("Chester", false, 70, "Beards and there many uses");
		Maps tempMap = new Maps("Albania", 4, false);
		Maps tempMap2 = new Maps("Lithuania", 1, false);
		Maps tempMap3 = new Maps("Germany", 2, false);
		Maps tempMap4 = new Maps("France", 11, false);
		Maps tempMap5 = new Maps("England", 4, true);
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
	}
	
	//default List populations for testing purposes
//	public void populateBookList(ArrayList<Book> bookList, HashMap<Integer, String> itemMap)
//	{
//		Book tempBook = new Book("Chris", false, 50, "Java for Dummies");
//		Book tempBook2 = new Book("Chris", true, 35, "Java for Experts");
//		Book tempBook3 = new Book("Chester", false, 100, "Why TDD is Bad");
//		Book tempBook4 = new Book("Josh", false, 67, "Maths for 8 Year Olds");
//		Book tempBook5 = new Book("Chester", false, 70, "Beards and there many uses");
//		bookList.add(tempBook);
//		itemMap.put(tempBook.getBookID(), "BOOK");
//		bookList.add(tempBook2);
//		itemMap.put(tempBook2.getBookID(), "BOOK");
//		bookList.add(tempBook3);
//		itemMap.put(tempBook3.getBookID(), "BOOK");
//		bookList.add(tempBook4);
//		itemMap.put(tempBook4.getBookID(), "BOOK");
//		bookList.add(tempBook5);
//		itemMap.put(tempBook5.getBookID(), "BOOK");
//	
//	}
//	
//	public void populateMapList(ArrayList<Maps> mapList, HashMap<Integer, String> itemMap)
//	{
//		Maps tempMap = new Maps("Albania", 4, false);
//		Maps tempMap2 = new Maps("Lithuania", 1, false);
//		Maps tempMap3 = new Maps("Germany", 2, false);
//		Maps tempMap4 = new Maps("France", 11, false);
//		Maps tempMap5 = new Maps("England", 4, true);
//		mapList.add(tempMap);
//		itemMap.put(tempMap.getMapID(), "MAP");
//		mapList.add(tempMap2);
//		itemMap.put(tempMap2.getMapID(), "MAP");
//		mapList.add(tempMap3);
//		itemMap.put(tempMap3.getMapID(), "MAP");
//		mapList.add(tempMap4);
//		itemMap.put(tempMap4.getMapID(), "MAP");
//		mapList.add(tempMap5);
//		itemMap.put(tempMap5.getMapID(), "MAP");
//	}
//	
//	public void populateNewsList(ArrayList<Newspapers> newsList, HashMap<Integer, String> itemMap)
//	{
//		Date tempDate = new Date();
//		Newspapers tempNews = new Newspapers("Daily Mail", tempDate, false);
//		Date tempDate2 = new Date(2012, 10, 12);
//		Newspapers tempNews2 = new Newspapers("Daily Mail", tempDate2, false);
//		Date tempDate3 = new Date(1998, 4, 22);
//		Newspapers tempNews3 = new Newspapers("Daily Mail", tempDate3, false);
//		Date tempDate4 = new Date(2008, 8, 16);
//		Newspapers tempNews4 = new Newspapers("Daily Mail", tempDate4, false);
//		Date tempDate5 = new Date(2001, 4, 11);
//		Newspapers tempNews5 = new Newspapers("Daily Mail", tempDate5, false);
//		newsList.add(tempNews);	
//		itemMap.put(tempNews.getNewsID(), "NEWSPAPER");
//		newsList.add(tempNews2);		
//		itemMap.put(tempNews2.getNewsID(), "NEWSPAPER");
//		newsList.add(tempNews3);	
//		itemMap.put(tempNews3.getNewsID(), "NEWSPAPER");
//		newsList.add(tempNews4);	
//		itemMap.put(tempNews4.getNewsID(), "NEWSPAPER");	
//		newsList.add(tempNews5);	
//		itemMap.put(tempNews5.getNewsID(), "NEWSPAPER");	
//	}
	
	
}
