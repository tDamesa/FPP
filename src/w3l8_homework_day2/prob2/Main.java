package w3l8_homework_day2.prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Marketing> list = new ArrayList<Marketing>();
		Marketing obj = new Marketing("Helen", "oil", 1000.78);
		Marketing obj1 = new Marketing("Helen", "Milk", 1000.78);
		Marketing obj2 = new Marketing("Des", "Belt", 600.45);
		Marketing obj3 = new Marketing("Abinet", "computer", 5000.3);
		Marketing obj4 = new Marketing("Samsung", "TV", 1409.90);
		Marketing_Comparator m = new Marketing_Comparator();
		list.add(obj);
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		list.set(1, obj4);
		System.out.println(list);
		System.out.println(list.size());
		// Collections.sort(list, new Marketing_Comparator());
		System.out.println(list);
		System.out.println(obj.equals(obj1));
		System.out.println(m.compare(obj, obj1));
		List newList = listMoreThan1000(list);
		System.out.println(newList);
		Collections.sort(newList, new Marketing_Comparator());
		System.out.println(newList);

	}

	public static List<Marketing> listMoreThan1000(List<Marketing> list) {

		List<Marketing> temp = new ArrayList<Marketing>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).salesamount >= 1000)
				temp.add(list.get(i));
		}

		return temp;
	}

	public static final class Marketing_Comparator implements Comparator<Marketing> {
		@Override
		public int compare(Marketing o1, Marketing o2) {
			int i = o1.employeename.compareTo(o2.employeename);
			if (i == 0) {
				i = Double.compare(o1.salesamount, (o2.salesamount));
			}
			return i;
		}
	}
}
/*
 * Output: [employeename=Helen, productname=oil, salesamount=1000.78,
 * employeename=Helen, productname=Milk, salesamount=1000.78, employeename=Des,
 * productname=Belt, salesamount=600.45, employeename=Abinet,
 * productname=computer, salesamount=5000.3] [employeename=Helen,
 * productname=oil, salesamount=1000.78, employeename=Des, productname=Belt,
 * salesamount=600.45, employeename=Abinet, productname=computer,
 * salesamount=5000.3] [employeename=Helen, productname=oil,
 * salesamount=1000.78, employeename=Samsung, productname=TV,
 * salesamount=1409.9, employeename=Abinet, productname=computer,
 * salesamount=5000.3] 3 [employeename=Helen, productname=oil,
 * salesamount=1000.78, employeename=Samsung, productname=TV,
 * salesamount=1409.9, employeename=Abinet, productname=computer,
 * salesamount=5000.3] true 0 [employeename=Helen, productname=oil,
 * salesamount=1000.78, employeename=Samsung, productname=TV,
 * salesamount=1409.9, employeename=Abinet, productname=computer,
 * salesamount=5000.3] [employeename=Abinet, productname=computer,
 * salesamount=5000.3, employeename=Helen, productname=oil, salesamount=1000.78,
 * employeename=Samsung, productname=TV, salesamount=1409.9]
 */