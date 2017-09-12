package w1l4_homework;

public class MergeString {

	public static void main(String[] args) {

		System.out.println(merge("eeeeeeeeeehllo", "hllo"));

	}

	static public String merge(String str1, String str2) {

		//Base case
		if (str1 == "" || str1.equals(null))
			return str2;
		if (str2 == "" || str2.equals(null))
			return str1;

		if (str1.charAt(0) < str2.charAt(0)) {
			// Assigning the first character of str1 to c
			char c = str1.charAt(0);

			if (str1.length() == 1)
				str1 = "";
			else
				str1 = str1.substring(1);
			// Out put + Recursion case
			return c + merge(str1, str2);
		} else {
			// Assigning the first character of str2 to c

			char c = str2.charAt(0);
			if (str2.length() == 1)
				str2 = "";
			else
				str2 = str2.substring(1);
			// Out put + Recursion case
			return c + merge(str2, str1);
		}
	}
}
/*Output:
  eeeeeeeeeehhlllloo*/
