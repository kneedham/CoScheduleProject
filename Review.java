package com.example.coschedule;

/*
 * Defines the Review object
 */
public class Review extends Comments {
	private double rating;
	
	public Review() {
		super();
		this.setRating(0);
	}
	
	public Review(double rating, int id, String comment, String author) {
		super(id, comment, author);
		this.setRating(rating);
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
}