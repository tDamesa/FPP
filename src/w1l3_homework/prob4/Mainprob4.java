package w1l3_homework.prob4;

import java.util.*;

public class Mainprob4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("Enter R for Rectangle");
			System.out.println("Enter C for circle");
			System.out.println("Enter T for Triangle");
			String choice = in.next();
			//Area of rectangle	
			if (choice.equalsIgnoreCase("R")) {
				System.out.println("please enter the width: ");
				double width = in.nextDouble();
				System.out.println("please enter the height: ");
				double height = in.nextDouble();
				Rectangle areaR = new Rectangle(width, height);
				System.out.println("area of the Rectangle: " + areaR.computeArea(areaR.getHeight(), areaR.getWidth()));
			}
			//Area of circle
			if (choice.equalsIgnoreCase("C")) {
				System.out.println("Enter the radius: ");
				double radius = in.nextDouble();
				Circle areaC = new Circle(radius);
				System.out.println("area of the circle: " + areaC.computeArea(areaC.getRadius()));
			}
			//Area of triangle
			if (choice.equalsIgnoreCase("T")) {
				System.out.println("Enter the height: ");
				double height = in.nextDouble();
				System.out.println("Enter the base: ");
				double base = in.nextDouble();
				Triangle areaT = new Triangle(height, base);
				System.out
						.println("The area of the triangle: " + areaT.computeArea(areaT.getHeight(), areaT.getBase()));
			} 
			//If input is other than T,C, and R
			else {
				System.out.println("please enter the correct letter");
			}
			//exit
			System.out.println("Do you like to continue? please enter yes/no :");
			in.nextLine();
			String end = in.nextLine();
			if (end.equalsIgnoreCase("no"))
				break;
		}
	}

}
