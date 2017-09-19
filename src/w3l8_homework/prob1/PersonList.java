package w3l8_homework.prob1;

import java.util.Collection;
import java.util.Collections;

public class PersonList {
	private final int array_length = 5;
	private Person[] perArr;
	int size;

	public PersonList() {
		this.perArr = new Person[array_length];
		size = 0;
	}

	public void add(Person p) {
		if (size > array_length)
			resize();
		perArr[size] = p;
		size++;
	}

	public Person get(int index) {
		if (index < 0 || index >= size)
			return null;
		return perArr[index];
	}

	public void insert(Person p, int index) {
		if (index < 0 || index > size)
			return;
		if (index >= perArr.length || size + 1 > perArr.length)
			resize();
		Person[] temp = new Person[perArr.length + 1];
		System.arraycopy(perArr, 0, temp, 0, index);
		temp[index] = p;
		System.arraycopy(perArr, index, temp, index + 1, perArr.length - index);
		size++;
		perArr = temp;
	}

	public int find1(Person p) {
		int pos = -1;
		for (int i = 0; i < size; i++) {
			if (perArr[i] == p) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	public void removing(Person p) {
		if (size == 0)
			return;
		find1(p);
		Person[] temp = new Person[perArr.length];
		System.arraycopy(perArr, 0, temp, 0, find1(p));
		System.arraycopy(perArr, find1(p) + 1, temp, find1(p), perArr.length - find1(p) - 1);
		perArr = temp;
		--size;

	}

	public void resize() {
		int arrLen = perArr.length;
		int tempLen = 2 * perArr.length;
		Person[] temp = new Person[tempLen];
		System.arraycopy(perArr, 0, temp, 0, size);
		perArr = temp;
	}

	public void print() {
		for (Person p : perArr) {
			System.out.println(p);
		}
	}  

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; i++) {
			sb.append(perArr[i] + ",");
		}
		sb.append(perArr[size - 1] + "]");
		return sb.toString();
	}

}
