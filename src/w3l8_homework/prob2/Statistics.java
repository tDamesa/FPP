package w3l8_homework.prob2;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	static double totSalary;
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		
		//implement
		//compute sum of all salaries of people in aList and return
		for(EmployeeData e:aList){
			totSalary+=e.getSalary();
		}
		return totSalary;
	}
}
