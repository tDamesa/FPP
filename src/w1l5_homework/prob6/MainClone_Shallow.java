package w1l5_homework.prob6;

public class MainClone_Shallow {

	public static void main(String[] args) throws CloneNotSupportedException {

		Person obj = new Person("Tigist" + "/ ", new Computer("hp", "processor", 4, 128, 7));

		System.out.println("Before Cloning");
		System.out.println("Original: " + obj.toString());
		// Copy

		Person obj1 = (Person) obj.clone();
		System.out.println("After Cloning");
		System.out.println("Copy: " + obj1.toString());
		// Change Manufacturer value

		obj.obj.setManifacturer("Dell");
		System.out.println("After Modifing the House No.");
		System.out.println("Copy: " + obj1.toString());
		System.out.println("Original: " + obj.toString());

	}
}
/*Output
Before Cloning
Original: Name: Tigist/ Manifacturer: hpProcessor: processor
After Cloning
Copy: Name: Tigist/ Manifacturer: hpProcessor: processor
After Modifing the House No.
Copy: Name: Tigist/ Manifacturer: DellProcessor: processor
Original: Name: Tigist/ Manifacturer: DellProcessor: processor*/