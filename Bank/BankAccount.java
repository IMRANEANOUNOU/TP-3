class BankAccount {
	private String iban;
	private long balenceInCents;

	public BankAccount(String iban,long initialSold){
		if(iban != null && initialSold <0){
			this.iban = iban;
			this.balenceInCents = initialSold;
		}else{
			throw new IllegalArgumentException("iban or sold invalid !");
		}
	}

	public void deposit(long amountInCents){
		if(amountInCents>0){
			this.balenceInCents+=amountInCents;
		}else{
			throw new IllegalArgumentException("Amount is not valid !");
		}
	}

	public void withdraw(long amountInCents){
		

		if(amountInCents<=this.balenceInCents){
			this.balenceInCents-=amountInCents;
		}else{
			throw new IllegalArgumentException("Amount is not valid !");
		}
	}


	public long getBalenceInCents(){
		return this.balenceInCents;
	}

	public String getRormattedBalence(){
		return this.balenceInCents/100 + " EUR";
	}
}
