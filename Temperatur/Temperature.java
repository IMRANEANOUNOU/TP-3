class Temperature {
	private double value ; // en Celesuis


	public Temperature(double value){
		if(value < -273.15){
			throw new IllegalArgumentException("Temperature invalide  !");
		}else{
			this.value = value;
		}
	}


	public double getValue(){
		return this.value;
	}

	public void setValue(double value){
		if(value < -273.15){
			throw new IllegalArgumentException("Temperature invalide  !");
		}else{
			this.value = value;
		}
	}
	

}