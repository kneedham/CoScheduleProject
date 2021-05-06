package com.example.coschedule;

/*
 * Defines the Comments object
 */
public class Comments {
	private int id;
	private String commentText;
	private String author;
	
	public Comments() {
		this.setId(0);
		this.setComment(null);
		this.setAuthor(null);
	}
	
	public Comments(int id, String commentText, String author) {
		this.setId(id);
		this.setComment(commentText);
		this.setAuthor(author);
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getComment() {
		return this.commentText;
	}
	
	public void setComment(String commentText) {
		this.commentText = commentText;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
}
