package w1l1l2_homework;

public class Prob1 {

	public static void main(String[] args) {
		//get random number and assign it to x
		int x = RandomNumbers.getRandomInt(1, 9);
		//Execute pi power of x
		double powx = Math.pow(Math.PI, x);
		System.out.println(powx);
		//get random number and assign it to y
		int y=RandomNumbers.getRandomInt(3,14);
		//Execute y power of pi
		double ypow=Math.pow(y,Math.PI);
		System.out.println(ypow);
	}

}
//Output:
//	97.40909103400242
//	1869.096004857077