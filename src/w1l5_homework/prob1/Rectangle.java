package w1l5_homework.prob1;

class Rectangle extends Shape {
	double width;
	double height;

	public Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width * height;
	}

	public double calculatePerimeter() {
		return 2 * width + 2 * height;
	}
}
