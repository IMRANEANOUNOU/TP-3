package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.model.Member;
import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private List<Book> books;
    private List<Member> members;

    public LibraryService(){
    	this.books = new ArrayList<>();
    	this.members = new ArrayList<>();
    }

    public void addBook(Book book){
    	this.books.add(book);
    }

    public void addMember(Member member){
    	this.members.add(member);
    }
    public List<Book> getBooks(){
    	return this.books;
    }
    public List<Member> getMembers(){
    	return this.members;
    }
}