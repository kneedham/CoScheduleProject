package com.example.coschedule;

import java.util.ArrayList;

/*
 * Defines the BestsellerLists object
 */
public class BestsellerLists {
	private String name;
	private ArrayList<Book> books;

	public BestsellerLists() {
		this.setName(null);
		this.setBooks(null);
	}
	
	public BestsellerLists(String name, ArrayList<Book> books) {
		this.setName(name);
		this.setBooks(books);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	
}
