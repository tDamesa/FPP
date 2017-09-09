package w1l3_homework.prob2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Mainprob2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LocalDate dateofBirth;
		// Input date format
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		// Get input from user
		while (true) {
			System.out.println("Please enter your dateofBirth " + "in MM/dd/yyyy format (e.g. 06/12/1980): ");
			String input = in.nextLine();
			try {
				dateofBirth = LocalDate.parse(input, format);
				break;
			} catch (DateTimeParseException e) {
				System.out.println("Error! Please try again");
			}
		}
		in.close();
		// Create an object for HeartRate class
		HeartRate hRate = new HeartRate("Abeba", "Des", dateofBirth);
		// print out age in years
		System.out.println(hRate.calculateAge().getYears());
		// Print out maximum heart rate
		System.out.println("Your max heart rate is :" + hRate.maximumHeartRate());
		// Print out the range of target heart rate
		for (int i = 0; i < 1; i++) {
			System.out.println("Your target heart rate range is :" + hRate.targetHearRange()[i] + " to "
					+ hRate.targetHearRange()[i + 1]);
		}
		// print out the override method
		System.out.println(hRate.toString());
	}

}
/*input:09/08/2000
Output:
17
Your max heart rate is :203
Your target heart rate range is :136 to 183
HeartRate [firstName=Abeba, lastName=Des, dateofBirth=2000-09-08, calculateAge=17, maximumHeartRate=203, lowerBTHRandupperBTHR=[136, 183]]
*/