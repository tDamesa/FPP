package w1l5_homework.prob1;

public class Main {

	static double totalArea = 0.0;
	static double totalPerimeter = 0.0;

	public static void main(String[] args) {

		Shape[] obj = { new Rectangle("white", 5, 12), new Circle("blue", 5), new Square("blue", 4) };
		printTotal(obj);
	}

	public static void printTotal(Shape[] shapes) {
	//	shapes = new Shape[5];
		
		for (Shape x : shapes) {
			totalArea += x.calculateArea();
			totalPerimeter += x.calculatePerimeter();
		}
		String x = String.format("Total Area of Shapes: "+"%.2f\n", totalArea);
		System.out.printf(x);
		String y = String.format("Total Perimeter of Shapes: "+"%.2f\n", totalPerimeter);
		System.out.println(y);
	}
}
/*Output
 Total Area of Shapes: 154.54
Total Perimeter of Shapes: 81.42*/
