package com.example.library.model;

final public class Book {
	private final String isbn;
	private final String title;
	private final String author;

	public Book(String isbn,String title,String author){
		if (title == null || title.isEmpty()) {
			throw new IllegalArgumentException("Title cannot be empty");
		}
		if (author == null || author.isEmpty()) {
			throw new IllegalArgumentException("Author cannot be empty");
		}
		if (isbn == null || isbn.isEmpty()) {
			throw new IllegalArgumentException("Isbn cannot be empty");
		}
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
