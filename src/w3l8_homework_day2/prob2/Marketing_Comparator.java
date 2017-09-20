package w3l8_homework_day2.prob2;

import java.util.Comparator;

public class Marketing_Comparator implements Comparator<Marketing> {
	@Override
	public int compare(Marketing o1, Marketing o2) {
		if (o1.employeename.compareTo(o2.employeename) != 0) {
			return o1.employeename.compareTo(o2.employeename);
		}
		return Double.compare(o1.salesamount, (o2.salesamount));
	}

}
