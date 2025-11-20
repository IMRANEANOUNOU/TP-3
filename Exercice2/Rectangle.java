class Rectangle {
	private double width;
	private double height;

	public void setWidth(double width){
		if(width < 0){
			throw new IllegalArgumentException("width < 0");
		}else{
			this.width = width;
		}
	}
	public void setHeight(double height){
		
		if(height < 0){
			throw new IllegalArgumentException("width < 0");
		}else{
			this.height = height;
		}
	}

	public double getWidth(){
		return this.width;
	}

	public double getHeight(){
		return this.height;
	}
	public double area() {
	        return width * height;
	    }
}

