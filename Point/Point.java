class Point {
	private int x;
	private int y;
	
	public Point(){
		this(0,0); // call the constructor Point(int x , int y)
	}
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}

	public void translate(int dx,int dy){
		this.x+=dx;
		this.y+=dy;
	}


	public String toString(){
		return "Point(" + this.x + "," + this.y + ")";
	}

}
