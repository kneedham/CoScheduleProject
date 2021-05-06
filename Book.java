package com.example.coschedule;

import java.util.ArrayList;

/*
 * Defines the Book object
 */
public class Book {
	private String title;
	private String author;
	private ArrayList<Review> reviews;
	private ArrayList<Comments> comments;
	
	public Book() {
		this.setTitle(null);
		this.setAuthor(null);
		this.setReviews(null);
		this.setComments(null);
	}
	
	public Book(String title, String author, ArrayList<Review> review, ArrayList<Comments> comment) {
		this.setTitle(title);
		this.setAuthor(author);
		this.setReviews(review);
		this.setComments(comment);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public ArrayList<Review> getReviews() {
		return reviews;
	}

	public void setReviews(ArrayList<Review> reviews) {
		this.reviews = reviews;
	}

	public ArrayList<Comments> getComments() {
		return comments;
	}

	public void setComments(ArrayList<Comments> comments) {
		this.comments = comments;
	}
	
	public void addComment(Comments comment) {
		this.comments.add(comment);
	}
	
	public void deleteComment(Comments comment) {
		this.comments.remove(comment);
	}
	
	
}
