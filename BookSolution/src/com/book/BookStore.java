package com.book;

import java.util.ArrayList;

public class BookStore {
	ArrayList<Book> book=new ArrayList<Book>();
	public void addBook(Book b) {
		book.add(b);
	}
	
	public void searchByTittle(String title) {
		boolean flag = false;
		for(Book b :this.book ) {
			if(b.title.contains(title)) {
				System.out.println(b.bookId);
				System.out.println(b.author);
				System.out.println(b.category);
				System.out.println(b.title);
				System.out.println(b.price);
				flag = true;
				break;
			}
		}
		if(flag == false) {
			System.out.println("book not found by title");
		}
	}

	void searchByAuthor(String author) {
		boolean flag = false;
		for(Book b :this.book ) {
			if(b.title.contains(author)) {
				System.out.println(b.bookId);
				System.out.println(b.author);
				System.out.println(b.category);
				System.out.println(b.title);
				System.out.println(b.price);
				flag = true;
				break;
			}
		}
		if(flag == false) {
			System.out.println("book not found by author");
		}
	}
	
	public void displayAlll() {
		for(Book b :this.book ) {
				System.out.println(b.bookId);
				System.out.println(b.author);
				System.out.println(b.category);
				System.out.println(b.title);
				System.out.println(b.price);
			}
	}
	
}
