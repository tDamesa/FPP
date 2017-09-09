package w1l3_homework.prob3;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class MyDate {
	LocalDate date;

	// Contractor for "MM/dd/yyyy" format
	public MyDate(int month, int day, int year) {
		date = LocalDate.of(year, month, day);
	}
	// Contractor for "MMMM dd, yyyy" format

	public MyDate(String month, int day, int year) {
		date = LocalDate.of(year, Month.valueOf(month), day);
	}

	// Contractor for "D yyyy" format
	public MyDate(int daysInAYear, int year) {
		date = LocalDate.ofYearDay(year, daysInAYear);
	}

	// Formatting
	public static final String DATE_PATTERN_MMDDYYYY = "MM/dd/yyyy";
	public static final String DATE_PATTERN_MONTHDDYYYY = "MMMM dd, yyyy";
	public static final String DATE_PATTERN_DDDYYYY = "D yyyy";

	// Print out the date in the three format
	public void print() {
		System.out.println(date.format(DateTimeFormatter.ofPattern(DATE_PATTERN_MMDDYYYY)));
		System.out.println(date.format(DateTimeFormatter.ofPattern(DATE_PATTERN_MONTHDDYYYY)));
		System.out.println(date.format(DateTimeFormatter.ofPattern(DATE_PATTERN_DDDYYYY)));

	}
}
