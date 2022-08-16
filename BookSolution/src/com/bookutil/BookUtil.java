package com.bookutil;

import java.util.ArrayList;
import java.util.Scanner;

import com.book.Book;
import com.book.BookStore;
import com.book.InvalidBookException;

public class BookUtil {
	

	public static void main(String[] args) throws InvalidBookException {
	Book b = new Book("B","title","author","Science",10);
	BookStore bookStore = new BookStore();
	String bookId,title,author,category;
	float price;
	ArrayList<Book> books=new ArrayList<Book>();
	Scanner sc= new Scanner(System.in);
	
	
//	Read data from user for 3 Book objects.
	for(int i=1; i<=3; i++) {
		System.out.print("Book no:-"+ i);
		System.out.println();
		System.out.print("Enter Book id- ");
		bookId = sc.nextLine();
		System.out.print("Enter Book title- ");
		title = sc.nextLine();
		System.out.print("Enter Book author- ");
		author = sc.nextLine();
		System.out.print("Enter Book category- ");
		category = sc.nextLine();
		System.out.print("Enter Book price- ");
		price = sc.nextFloat();
		books.add(new Book(bookId,title,author,category,price));
	}
	
//	Call the addBook method to add the book objects into the collection
	for(Book book :books ) {
		bookStore.addBook(book);
		}
	
//	Search the books by title
	bookStore.searchByTittle("Bt");

//	Search the books by author
	bookStore.searchByTittle("ram");
	
//  Display all the book details
	bookStore.displayAlll();
	
	
}
}
