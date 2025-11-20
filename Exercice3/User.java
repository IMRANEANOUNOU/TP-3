class User{
	String username;
	String email;

	public User(String username , String email){
		this.username = username;
		this.email = email;
	}

	public String toString(){
		return "User Info : Username = " + this.username + " & Email = " + this.email;
	}

}