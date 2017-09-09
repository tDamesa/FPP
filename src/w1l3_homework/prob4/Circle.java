package w1l3_homework.prob4;

public final class Circle {
	private final double radius;

	// Constructor for Circle class
	public Circle(double radius) {
		this.radius = radius;
	}

	// get the radius
	public double getRadius() {
		return radius;
	}

	// Calculate the area of a circle
	public double computeArea(double radius) {
		return Math.PI * (radius * radius);
	}
}
