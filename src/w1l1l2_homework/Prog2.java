package w1l1l2_homework;

public class Prog2 {

	public static void main(String[] args) {
		float num1=1.27f;
		float num2=3.881f;
		float num3=9.6f;
		//sum with out rounding
	int sum=(int)(num1+num2+num3);
	System.out.println(sum);
	//rounded sum
	int sumR=(int)Math.round(num3+num2+num1);
	System.out.println(sumR);
	}

}

//output:
//	14
//	15
