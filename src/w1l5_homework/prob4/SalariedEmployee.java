package w1l5_homework.prob4;

public class SalariedEmployee extends Employee {
	private double weeklySalary;
	

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary=weeklySalary;

	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public double getPaymentAmount() {
		
		return weeklySalary;
	}
	@Override
	public String toString() {
		return "CommissionEmployee [First Name: "
				+ getFirstName() + ", Last Name: " + getLastName() + ",SocialSecurityNumber: "
				+ getSocialSecurityNumber() +"Weekly salary: "+weeklySalary+"Payment amount"+ getPaymentAmount() + "]";
}
}
