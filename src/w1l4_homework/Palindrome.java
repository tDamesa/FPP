package w1l4_homework;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(ispalindrome("madam"));

	}

	public static boolean ispalindrome(String word) {
		// Base case
		if (word.length() == 0 || word.length() == 1)
			return true;
		// Checking the first and the last word are the same
		if (word.charAt(0) != word.charAt(word.length() - 1))
			return false;
		else {
			// Recursion case
			return ispalindrome(word.substring(1, (word.length() - 1)));
		}
	}
}
//Output: true