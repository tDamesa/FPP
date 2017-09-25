package w3l12_homework.prob1;

import java.io.Closeable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Mark {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please input the marks");

		try {
			int input = in.nextInt();
			exceptionMark(input);

		} catch (InputMismatchException | NegetiveInput_Exception | MarkMoreThan100_Exception e) {
			System.err.println(e);
			 e.printStackTrace();
		} finally {
			System.out.println("end");
			in.close();
		}

	}

	public static void exceptionMark(int mark) throws NegetiveInput_Exception, MarkMoreThan100_Exception{
		if (mark > 100)
			throw new MarkMoreThan100_Exception();
		if (mark < 0)
			throw new NegetiveInput_Exception();
	}
}
/*Output:
 Please input the marks
bnbn
java.util.InputMismatchException
end
java.util.InputMismatchException
	at java.util.Scanner.throwFor(Scanner.java:864)
	at java.util.Scanner.next(Scanner.java:1485)
	at java.util.Scanner.nextInt(Scanner.java:2117)
	at java.util.Scanner.nextInt(Scanner.java:2076)
	at w3l12_homework.prob1.Mark.main(Mark.java:14)
	----------------------------------------------
	Please input the marks
600
Input grater than 100
w3l12_homework.prob1.MarkMoreThan100_Exceptionend

w3l12_homework.prob1.MarkMoreThan100_Exception
	at w3l12_homework.prob1.Mark.exceptionMark(Mark.java:29)
	at w3l12_homework.prob1.Mark.main(Mark.java:15)
---------------------------------------------------
Please input the marks
-9
Negetive Input
w3l12_homework.prob1.NegetiveInput_Exception
w3l12_homework.prob1.NegetiveInput_Exception
	at w3l12_homework.prob1.Mark.exceptionMark(Mark.java:31)
	at w3l12_homework.prob1.Mark.main(Mark.java:15)
end

	*/
