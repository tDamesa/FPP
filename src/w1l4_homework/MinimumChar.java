package w1l4_homework;

public class MinimumChar {
	final static char SMALLEST_CHAR = '~';

	public static void main(String[] args) {
		System.out.println(minChar(SMALLEST_CHAR, "javA0e7"));
	}

	static public char minChar(char c, String word) {
		// Base case
		if (word == "" || word.equals(null))
			return c;
		// Assigning the first character of word as smallest
		if (c == SMALLEST_CHAR) {
			c = word.charAt(0);
		} else {
			if (c > word.charAt(0)) {
				c = word.charAt(0);
			}
		}
		if (word.length() == 1) {
			return c;
		}
		word = word.substring(1);
		// Recurstion case
		return minChar(c, word);
	}
}
//Output: 0
