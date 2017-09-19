package w3l8_homework.prob1;

public class Person implements Comparable<Person> {
	private String lastName;
	private String firstName;
	private int age;

	// --------------------------------------------------------------
	public Person(String last, String first, int a) { // constructor
		lastName = last;
		firstName = first;
		age = a;
	}

	// --------------------------------------------------------------
	public String getLast() // get last name
	{
		return lastName;
	}
	public String getFirst() // get last name
	{
		return firstName;
	}
	
	@Override
	public String toString() {
		return "Person [lastName=" + lastName + " FirstName=" + firstName + "Age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		return (firstName + lastName).compareTo(o.getFirst() + o.getLast());
	}

}
