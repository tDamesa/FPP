package w1l4_homework;

public class BinarySearchClass {

	public static void main(String[] args) {

		System.out.println(myBinarySearch("hi", 'h', 0, 2));
	}

	static public int myBinarySearch(String word, char key, int start, int end) {
		// Base case
		if (start > end || word == "" || word.equals(null))
			return -1;
		// Calculating the position
		int position = (start + end) / 2;
		// Check the position character is equals to key
		if (key == word.charAt(position))
			return position;
		else if (key < word.charAt(position)) {
			end = position - 1;
			// Recursion
			return myBinarySearch(word, key, start, end);
		} else {
			start = position + 1;
			// Recursion
			return myBinarySearch(word, key, start, end);
		}

	}
}
//Output:0