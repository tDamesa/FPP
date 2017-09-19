package w3l8_homework.prob2;

import java.lang.reflect.Array;
import java.util.*;
public class Main {

	/** Combines the lists that are populated here into a single list
	 *  and passes to computeSumOfSalaries
	 */
	public static void main(String[] args) {
		List<Staff> staff = new ArrayList<>();
		staff.add(new Staff("John", 110000, 2));
		staff.add(new Staff("Tom", 110000, 4));
		staff.add(new Staff("Edward", 120000, 1));
		staff.add(new Staff("Rich",90000, 3));
		staff.add(new Staff("Kevin", 100000,1));

		List<Teacher> teachers = new ArrayList<>();
		teachers.add(new Teacher("Andrew", 110000, 10000));
		teachers.add(new Teacher("Rabelais", 130000, 5500));
		teachers.add(new Teacher("Phil", 135000, 12000));
		teachers.add(new Teacher("Tony",95000, 8000));
		
		
		//Implementation steps
		//Step 1: implement the combine method, to combine the two lists
		List<EmployeeData> combined = combine(staff, teachers);
		
		//Step 2: pass the combined list to computeSumOfSalaries
		double salarySum = Statistics.computeSumOfSalaries(combined);
		System.out.println(salarySum);
		
	}
	
	//IMPLEMENT
	public static List<EmployeeData> combine(List<Staff> staff, List<Teacher> teachers) {
		List<EmployeeData> temp = new  ArrayList();
		temp.addAll(staff);
		temp.addAll(teachers);
		for(EmployeeData e: temp){
			System.out.println(e);
		}
			
		return temp;
	}

}

/*Output:
Staff [name=John, salary=110000.0, numDependants=2]
Staff [name=Tom, salary=110000.0, numDependants=4]
Staff [name=Edward, salary=120000.0, numDependants=1]
Staff [name=Rich, salary=90000.0, numDependants=3]
Staff [name=Kevin, salary=100000.0, numDependants=1]
Teacher [bonus=10000.0, name=Andrew, salary=110000.0]
Teacher [bonus=5500.0, name=Rabelais, salary=130000.0]
Teacher [bonus=12000.0, name=Phil, salary=135000.0]
Teacher [bonus=8000.0, name=Tony, salary=95000.0]
1035500.0
*/