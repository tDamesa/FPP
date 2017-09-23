package w3l11_homework.prob1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class EmployeeAdmin {

	/**
	 * Returns a list of Employees whose social security number is on the input
	 * list socSecNums and whose salary is > 80000. The list must be ordered by
	 * social security number, from lowest to highest. To sort, you must use a
	 * Collections sorting method and you must define your own Comparator to be
	 * used to compare Employees by ssn.
	 */

	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		// IMPLEMENT
		List<Employee> str = new ArrayList();
		Set<String> keys = table.keySet();
		for (String key : keys) {
			for (String ssn : socSecNums) {
				if (key == ssn && table.get(key).getSalary() > 80000)
					str.add(table.get(key));
			}

		}

		Collections.sort(str,new SSN_Comparator());
		return str;

	}

}
    