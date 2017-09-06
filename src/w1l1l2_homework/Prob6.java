package w1l1l2_homework;

import java.util.*;

public class Prob6 {

	public static void main(String[] args) {
		String[] animals = { "horse", "dog", "cat", "horse", "dog" };
		String[] noDuplicate = new String[5];
		int j = 0;
		Arrays.sort(animals);
		// remove duplicates from animals array and save it on noduplicate array
		for (int i = 0; i < animals.length - 1; i++) {
			if (animals[i] != animals[i + 1]) {
				noDuplicate[j] = animals[i];
				j++;
			}
			if (i == animals.length - 1 - 1)
				noDuplicate[j] = animals[animals.length - 1];
		}
		// removing the null values from noduplicates array and store them in finall array
		String[] finall = new String[j + 1];
		for (int i = 0; i <= j; i++) {
			finall[i] = noDuplicate[i];
		}
		System.out.println(Arrays.toString(noDuplicate));
		System.out.println(Arrays.toString(finall));
	}

}

//Output:
//	[cat, dog, horse, null, null]
//	[cat, dog, horse]