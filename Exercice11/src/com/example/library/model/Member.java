package com.example.library.model;

public class Member {
	private String id;
	private String name;
	private String email;

	public Member(String id,String name,String email){
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
