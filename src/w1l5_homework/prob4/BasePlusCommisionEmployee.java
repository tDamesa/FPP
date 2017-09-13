package w1l5_homework.prob4;

public class BasePlusCommisionEmployee extends CommissionEmployee {
	private double baseSalary;

	public BasePlusCommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commisionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commisionRate);
		this.baseSalary = baseSalary;

	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	@Override
	public double getPaymentAmount() {
		return baseSalary + (getGrossSales() * getCommisionRate());
	}
	@Override
	public String toString() {
		return "CommissionEmployee [First Name: "
				+ getFirstName() + ", Last Name: " + getLastName() + ",SocialSecurityNumber: "
				+ getSocialSecurityNumber() +"gross Sales ="+ getGrossSales()+ ", commision Rate: " + getCommisionRate() + "base Salary: "+ baseSalary+ "Payment Amount"+getPaymentAmount()+"]";
	}


}
