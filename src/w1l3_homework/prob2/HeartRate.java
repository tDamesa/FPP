package w1l3_homework.prob2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Scanner;

public class HeartRate {
	String firstName;
	String lastName;
	LocalDate dateofBirth;
	//Contractor to initialize the instant fields
	public HeartRate(String firstName, String lastName, LocalDate dateofBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofBirth = dateofBirth;
	}
	// get first Name
	public String getFirstName() {
		return firstName;
	}
	// set first Name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	// get Last Name
	public String getLastName() {
		return lastName;
	}
	// set Last Name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	// set Date of Birth
	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	// get Date of Birth
	public LocalDate getdateofBirth() {
		return dateofBirth;
	}
	//Age calculator
	public Period calculateAge() {
		LocalDate today = LocalDate.now();
		return Period.between(dateofBirth, today);
	}
	//Calculate maximum heart rate
	public int maximumHeartRate() {
		return 220 - calculateAge().getYears();
	}
	//Calculate target heart rate range.
	public int[] targetHearRange() {
		final int restHR=70;
		final double lowerB=0.5;
		final double upperB=0.85;
		int aveHeartRate=maximumHeartRate()-restHR;
		int lowerBTHR=(int)(aveHeartRate*lowerB)+restHR;
		int upperBTHR=(int)(aveHeartRate*upperB)+restHR;
		int [] range={lowerBTHR,upperBTHR};
		return range;
	}

	@Override
	public String toString() {
		return "HeartRate [firstName=" + firstName + ", lastName=" + lastName + ", dateofBirth=" + dateofBirth
				+ ", calculateAge=" + calculateAge().getYears()+ ", maximumHeartRate=" + maximumHeartRate()
				+ ", lowerBTHRandupperBTHR=" + Arrays.toString(targetHearRange()) + "]";
	}


}