package w1l3_homework.prob2;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AgeCalculator {
	static LocalDate dateofBirth;
    DateTimeFormatter formatte = DateTimeFormatter.ofPattern("yyyy-M-d");

    public LocalDate getBirthday() {
        return dateofBirth;
        }
   
    public Period calculateAge(LocalDate birthday) {
        LocalDate today = LocalDate.now();
        return Period.between(birthday, today);
    }
    
    public static void main(String[] args) {
        AgeCalculator ageCalculator = new AgeCalculator();
        LocalDate birthday = ageCalculator.getBirthday();
        Period age = ageCalculator.calculateAge(birthday);
        System.out.printf("Today you are %d years, %d months"
                + " and %d days old%n",
                age.getYears(), age.getMonths(), age.getDays());
    }
}