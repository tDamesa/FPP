package w3l12_homework.prob2;

public class CustomerAccount {
	String cus_name;
	String acc_No;
	double balance;

	public CustomerAccount() {

	}

	public CustomerAccount(String cus_name, String acc_No, double balance) {
		this.cus_name = cus_name;
		this.acc_No = acc_No;
		this.balance = balance;

	}

	public String getCus_name() {
		return cus_name;
	}

	public String getAcc_No() {
		return acc_No;
	}

	public double getBalance() throws Balance_Exception {
		if (balance < 100){
			throw new Balance_Exception();}
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposite(double amount) {
		balance = balance + amount;

	}

	public void Withdrow(double amount) throws Withdrow_Exception {
		if (amount < this.balance) {
			balance =this. balance - amount;
		} else {

			throw new Withdrow_Exception();
		}

	}

}
