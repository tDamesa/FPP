package w1l5_homework.prob2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Professor professor1 = new Professor("Chris", 5000, LocalDate.of(1989, 06, 5), 3);
		Professor professor2 = new Professor("David", 7000, LocalDate.of(1990, 03, 5), 1);
		Professor professor3 = new Professor("Mia", 6000, LocalDate.of(2010, 04, 16), 5);
		Secretary secratry1 = new Secretary("Sara", 4000, LocalDate.of(2013, 01, 4), 15.0);
		Secretary secratry2 = new Secretary("Ali", 1000, LocalDate.of(2016, 06, 30), 10.5);
		DeptEmployee[] department = { professor1, professor2, professor3, secratry1, secratry2 };
		System.out.println("Do see the sum of all Professor salary,  sum of all secretary salary and all salaries in the department? y/n ");
		String input = in.next();

		double totalProfessorSalary = 0;
		double totalSecratarySalary = 0;

		if (input.equalsIgnoreCase("y")) {
			for (DeptEmployee x : department) {
				if (x.getClass().getSimpleName().equals("Secretary"))
					totalSecratarySalary += x.computeSalary();
				else if (x.getClass().getSimpleName().equals("Professor")) {
					totalProfessorSalary += x.computeSalary();
				}
			}
			double totalDepDalary=  totalSecratarySalary + totalProfessorSalary;
			System.out.println("sum of all Professor salary:  " +totalProfessorSalary);
			System.out.println("sum of all secretary salary: " +totalSecratarySalary);
			System.out.printf("all salaries in the department: " +"%.2f\n", totalDepDalary);
		}

	}

}
/*Output:
 * Do see the sum of all Professor salary,  sum of all secretary salary and all salaries in the department? y/n 
y
sum of all Professor salary:  18000.0
sum of all secretary salary: 5306.0
all salaries in the department: 23306.00*/
