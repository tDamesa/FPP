package w1l3_homework.prob4;

public final class Rectangle {
	private final double width;
	private final double height;

	public Rectangle(double width, double height) {
		this.height = width;
		this.width = height;
	}
	//get the width
	public double getWidth() {
		return width;
	}
	//get the height
	public double getHeight() {
		return height;
	}
	// Calculate the area of a rectangle
	public double computeArea(double width,double height){
		return width*height;
	}
}
