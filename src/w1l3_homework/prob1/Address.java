package w1l3_homework.prob1;

public class Address {
	private String street;
	private String city;
	private String steetName;
	private String zip;

	// Address Contractor
	public Address(String street, String city, String streetName, String zip) {
		this.street = street;
		this.city = city;
		this.steetName = streetName;
		this.zip = zip;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getSteetName() {
		return steetName;
	}

	public String getZip() {
		return zip;
	}

}
