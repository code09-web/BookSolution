package com.book;
import java.util.*; 
import com.book.*;
public class Book {

	public String bookId,title,author;
	public String category;
	float price;
	public Book(String bookId, String title, String author, String category,float price) throws InvalidBookException {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		if(category.toLowerCase().equals("science")|| category.equals("fiction")|| category.toLowerCase().equals("technology") || category.toLowerCase().equals("others"))
			this.category = category;
		else
			throw new InvalidBookException("Category must be “Science”, “Fiction”, “Technology” or “Others”");
		if(price<0)
			throw new InvalidBookException("Price cannot be negative");
		else 
			this.price = price;
		
		if(bookId.charAt(0)!='B' && bookId.length()!=4)
			throw new InvalidBookException("bookID must start with ‘B’ and must be of length 4 characters");
		else
			this.bookId = bookId;
			
		
	}

}
//myassignmenttrack@gmail.com
