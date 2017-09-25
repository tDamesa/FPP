package w3l12_homework.prob2;

import java.nio.channels.NetworkChannel;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input customer name");
		String name = in.nextLine();
		System.out.println("Account number");
		String Acc = in.nextLine();
		System.out.println("Balance");
		double balance = in.nextDouble();
		CustomerAccount cusAcc = new CustomerAccount(name, Acc, balance);
		try {
			cusAcc.getBalance();
			System.out.println("Your current balance is"+ cusAcc.getBalance());
			
		} catch (Balance_Exception  e) {

			System.err.println(e);
		}
		try{
			System.out.println("Input the amount you want to withdrow");
			double amount = in.nextDouble();
			cusAcc.Withdrow(amount);
			System.out.println("Draw Money & enjoy, Best wishes of the day");
		}
		catch ( Withdrow_Exception e) {

			System.err.println(e);
		}
	}

	/*Output:
	 Input customer name
Jakie
Account number
347890
Balance
200
Your current balance is200.0
Input the amount you want to withdrow
500
You do not have this much money in your account
w3l12_homework.prob2.Withdrow_Exception
..........................................................
Input customer name
Hanna
Account number
5890389
Balance
60
Balance is too low
w3l12_homework.prob2.Balance_Exception
Input the amount you want to withdrow

	
	 */
	

}
