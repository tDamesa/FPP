package w1l5_homework.prob4;

public class Invoice implements Payable {

	private String partNumber;
	private String partDiscription;
	private int quantity;
	private double pricePerlterm;
	public Invoice(String partNumber,String partDiscription,int quantity,double pricePerlterm){
		this.partNumber=partNumber;
		this.partDiscription=partDiscription;
		this.quantity=quantity;
		this.pricePerlterm=pricePerlterm;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDiscription() {
		return partDiscription;
	}

	public void setPartDiscription(String partDiscription) {
		this.partDiscription = partDiscription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricePerlterm() {
		return pricePerlterm;
	}

	public void setPricePerlterm(double pricePerlterm) {
		this.pricePerlterm = pricePerlterm;
	}

	@Override
	public double getPaymentAmount() {
		return 0;
	}

	@Override
	public String toString() {
		return "Invoice [partNumber=" + partNumber + ", partDiscription=" + partDiscription + ", quantity=" + quantity
				+ ", pricePerlterm=" + pricePerlterm + "Payment Amount"+getPaymentAmount()+"]";
	}

}
