package com.example.library.model;

final public class Member {
	private final String id;
	private final String name;
	private final String email;

	public Member(String id,String name,String email){
		if (id == null || id.isEmpty()) {
			throw new IllegalArgumentException("Title cannot be empty");
		}
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Author cannot be empty");
		}
		if (email == null || email.isEmpty()) {
			throw new IllegalArgumentException("Isbn cannot be empty");
		}
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public String getId(){
		return this.id;
	}

	public String getName(){
		return this.name;
	}
	public String getEmail(){
		return this.email;
	}

	@Override
	public String toString(){
		String info = "id=> "+this.id+"-name=> "+this.name+"-email=> "+this.email;
		return info+"\n";
	}

}
