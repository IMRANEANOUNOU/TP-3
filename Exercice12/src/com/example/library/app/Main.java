package com.example.library.app;

import com.example.library.model.Book;
import com.example.library.model.Member;
import com.example.library.service.LibraryService;

public class Main {
	public static void main(String[] args) {
		LibraryService Ls = new LibraryService();

		Book book1 = new Book("isbn123","book1","ahmed");
		Book book2 = new Book("isbn444","book2","georg");
		Member member1 = new Member("1","said","said@gmail.com");
		Member member2 = new Member("2","hamid","georg@gmail.com");

		Ls.addBook(book1);
		Ls.addBook(book2);

		Ls.addMember(member1);
		Ls.addMember(member2);

		System.out.println("Books : ");
		System.out.println(Ls.getBooks());

		System.out.println("Members : ");
		System.out.println(Ls.getMembers());

	}
}