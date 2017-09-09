package w1l3_homework.prob3;

import java.util.Scanner;

public class Mainprob3 {

	public static void main(String[] args) {
		MyDate date = null;
		Scanner in = new Scanner(System.in);
		while (true) {
			//Select the input date format
			System.out.println("Enter 1 for format: MM/DD/YYYY ");
			System.out.println("Enter 2 for format: Month DD, YYYY");
			System.out.println("Enter 3 for format: DDD YYYY");
			System.out.println("Enter 4 to exit ");
			int input = in.nextInt();
			//Select first date format
			if (input == 1) {
				System.out.println("Enter Month: ");
				int month = in.nextInt();
				System.out.println("Enter day: ");
				int day = in.nextInt();
				System.out.println("Enter year: ");
				int year = in.nextInt();
				date = new MyDate(month, day, year);
			}
			//Select second dare format
			if (input == 2) {
				System.out.println("Enter Month: ");
				in.nextLine();
				String month = in.nextLine();
				System.out.println("Enter day: ");
				int day = in.nextInt();
				System.out.println("Enter year: ");
				int year = in.nextInt();
				date = new MyDate(month.toUpperCase(), day, year);
			}
			//Select third date format
			if (input == 3) {
				System.out.println("Enter days: ");
				int daysInAYear = in.nextInt();
				System.out.println("Enter year: ");
				int year = in.nextInt();
				date = new MyDate(daysInAYear, year);
			}
			//exit
			if (input == 4) {
				break;
			}
			date.print();
			//Continue or not
			System.out.println("Do you want to contniue: Y/N: ");
			if (in.next().equals("N")||in.next().equals("n"));
				break;
		}
	}
}
/*Enter 1 for format: MM/DD/YYYY 
Enter 2 for format: Month DD, YYYY
Enter 3 for format: DDD YYYY
Enter 4 to exit 

1
Enter Month: 
3
Enter day: 
4
Enter year: 
5
03/04/0005
March 04, 0005
63 0005
Do you want to contniue: Y/N: 

y
.............................
Enter 1 for format: MM/DD/YYYY 
Enter 2 for format: Month DD, YYYY
Enter 3 for format: DDD YYYY
Enter 4 to exit 
2
Enter Month: 
july
Enter day: 
3
Enter year: 
2034
07/03/2034
July 03, 2034
184 2034
Do you want to contniue: Y/N: 
y
.............................
Enter 1 for format: MM/DD/YYYY 
Enter 2 for format: Month DD, YYYY
Enter 3 for format: DDD YYYY
Enter 4 to exit 
3
Enter days: 
34
Enter year: 
2000
02/03/2000
February 03, 2000
34 2000
Do you want to contniue: Y/N: */
