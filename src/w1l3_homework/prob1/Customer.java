package w1l3_homework.prob1;

public class Customer {
	private String firstName;
	private String lastName;
	private String socialSecurityNum;
	private Address billingAdd;
	private Address shippingAdd;

	// Customer contractor to initialize instant fields
	public Customer(String firstName, String lastName, String socialSecurityNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNum = socialSecurityNum;
	}

	// get first Name
	public String getFirstName() {
		return firstName;
	}

	// set first Name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// get Last Name
	public String getLastName() {
		return lastName;
	}

	// set Last Name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// get Social Security Number
	public String getsocialSecurityNum() {
		return socialSecurityNum;
	}

	// set Social Security Number
	public void setsocialSecurityNum(String socialSecurityNum) {
		this.socialSecurityNum = socialSecurityNum;
	}

	// get Billing Address
	public Address getBillingAdd() {
		return billingAdd;
	}

	// set Billing Address
	public void setBillingAdd(Address billingAdd) {
		this.billingAdd = billingAdd;
	}

	// get Shipping Address
	public Address getShippingAdd() {
		return shippingAdd;
	}

	// set Shipping Address
	public void setShippingAdd(Address shippingAdd) {
		this.shippingAdd = shippingAdd;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", socialSecurityNum="
				+ socialSecurityNum + "]";
	}

}
