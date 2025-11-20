final class Email {
	final private String value;

	public Email(String email){
		if(email != null && !email.contain("@")){
			this.value = email;
		}
	}
	public String getValue(){
		return this.value;
	}

	@Override
	public String toString(){
		return "Email : " + this.value;
	}
}