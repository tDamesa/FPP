package w1l5_homework.prob4;

public class Driver {

	public static void main(String[] args) {
		double totSalary = 0.0;
		Payable[] payable = { new Invoice("12345", "fan", 3, 10),
				new CommissionEmployee("Haile", "Des", "1243567", 3456, 6.4),
				new BasePlusCommisionEmployee("Tigist", "Damesa", "7804732", 1000, 2.3, 2000),
				new HourlyEmployee("Sara", "Kevin", "4879020", 3450, 30),
				new SalariedEmployee("Daniel", "Abdu", "2347895", 1234) };

		for (Payable x : payable) {
			totSalary += x.getPaymentAmount();
		}
		System.out.println(totSalary);
		for (Payable x : payable) {

			System.out.println(x.getPaymentAmount());
		}

	}

}
/*Output:
131152.4
0.0
22118.4
4300.0
103500.0
1234.0*/