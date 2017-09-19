package w3l8_homework.prob1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		Person p = new Person("abeba", "des", 23);
		Person p1 = new Person("kebede", "haile", 34);
		Person p2 = new Person("chala", "taye", 54);
		Person p3 = new Person("fikir", "baye", 13);
		
		PersonList pl = new PersonList();
		pl.add(p);
		pl.add(p2);
		pl.add(p1);
		System.out.println("After insert: ");
		pl.insert(p3, 1);
		pl.print();
		System.out.println("Size:"+pl.size);
		System.out.println("index:" + pl.find1(p1));
		pl.removing(p);
		System.out.println("After remove: ");
		pl.print();
		System.out.println(pl.get(2));
		
	}
}
/*Output:
After insert: 
Person [lastName=abeba FirstName=desAge=23]
Person [lastName=fikir FirstName=bayeAge=13]
Person [lastName=chala FirstName=tayeAge=54]
Person [lastName=kebede FirstName=haileAge=34]
null
null
Size:4
index:3
After remove: 
Person [lastName=fikir FirstName=bayeAge=13]
Person [lastName=chala FirstName=tayeAge=54]
Person [lastName=kebede FirstName=haileAge=34]
null
null
null
Person [lastName=kebede FirstName=haileAge=34]
*/