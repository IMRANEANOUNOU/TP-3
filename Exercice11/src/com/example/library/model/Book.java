package com.example.library.model;

public class Book {
	private String isbn;
	private String title;
	private String author;

	public Book(String isbn,String title,String author){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}


	public String getIsbn(){
		return this.isbn;
	}
	public String getTitle(){
		return this.title;
	}
	public String getAuthor(){
		return this.author;
	}
	@Override
	public String toString(){
		String info = "-Title=> "+this.title+"-Isbn=> "+this.isbn+"-Author => "+this.author;
		return info + "\n";
	}
}
