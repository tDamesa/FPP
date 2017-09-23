package w3l11_homework.prob2;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		List<Account> acc= new ArrayList<>();
		double totBalance = 0;
		for (Employee e : emps) {
			for(Account a: e.getAccounts()){
				totBalance += a.getBalance();
			}
					
					
		}
		return totBalance;
	}
}
