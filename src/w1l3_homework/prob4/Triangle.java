package w1l3_homework.prob4;

public final class Triangle {
	private final double height;
	private final double base;
	//Constructor for Triangle class
	public Triangle(double height, double base){
	 this.height=height;
	 this.base=base;
 }
	//get the height of triangle
	public double getHeight(){
		return height;
	}
	//get the base of triangle
	public double getBase(){
		return base;
	}
	// Calculate the area of a triangle
	public double computeArea(double height,double base){
		return 0.5*height*base;
	}

}
