package w1l1l2_homework;
import java.util.*;

public class Prog4 {

	public static void main(String[] args) {
		String reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.print("Input a string ");
		// input
		String word = in.nextLine();
		// Reverse word array
		for (int i = word.length()-1; i >=0; i--) {
			reverse += word.charAt(i);
		}
		System.out.println(reverse);
	}

}

//Output:
//	Input a string hello
//	olleh
