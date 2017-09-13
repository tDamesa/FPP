package w1l5_homework.prob4;

public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commisionRate;

	public CommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSales, double commisionRate) {
		super(firstName,lastName,socialSecurityNumber);
		this.grossSales = grossSales;
		this.commisionRate = commisionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommisionRate() {
		return commisionRate;
	}

	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}

	
	@Override
	public double getPaymentAmount() {
		return grossSales * commisionRate;
	}
	@Override
	public String toString() {
		return "CommissionEmployee [First Name: "
				+ getFirstName() + ", Last Name: " + getLastName() + ",SocialSecurityNumber: "
				+ getSocialSecurityNumber() +"gross Sales ="+ grossSales + ", commision Rate: " + commisionRate +  "Payment Amount"+getPaymentAmount()+ "]";
	}


}
