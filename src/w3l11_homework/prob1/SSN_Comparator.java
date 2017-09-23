package w3l11_homework.prob1;

import java.util.Comparator;

public class SSN_Comparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getSsn().compareTo(o2.getSsn());
	}
}
