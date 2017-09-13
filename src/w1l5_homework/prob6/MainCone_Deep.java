package w1l5_homework.prob6;

public class MainCone_Deep {

	public static void main(String[] args) throws CloneNotSupportedException {

		Person1 p = new Person1("Tigist " + "/", new Computer1("hp", "processor", 4, 128, 7));

		System.out.println("Before Cloning");
		System.out.println("Original: " + p.toString());
		// Copy
		Person1 obj2 = (Person1) p.clone();
		System.out.println("After Cloning");
		System.out.println("Copy: " + obj2.toString());
		// Change Manufacturer value
		p.obj1.setManifacturer("Dell");
		System.out.println("After Modifing the House No.");
		System.out.println("Copy: " + obj2.toString());
		System.out.println("Original: " + p.toString());

	}

}
/*Output:
 Before Cloning
Original: Name: Tigist /Manifacturer: hpProcessor: processor
After Cloning
Copy: Name: Tigist /Manifacturer: hpProcessor: processor
After Modifing the House No.
Copy: Name: Tigist /Manifacturer: hpProcessor: processor
Original: Name: Tigist /Manifacturer: DellProcessor: processor
*/
