package w1l1l2_homework;


public class Prob5 {
	public static void main(String[] args) {

		int[][] array2 = new int[4][4];
		//get the random numbers and assign them in 4x4 matrix
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				array2[i][j] = RandomNumbers.getRandomInt(1, 99);
			}
		}
		//formating output
			String result = String.format("%5d %10d %10d %10d", array2[0][0], array2[0][1], array2[0][2], array2[0][3]);
			String result1 = String.format("%+5d %+10d %+10d %+10d", array2[1][0], array2[1][1], array2[1][2],
					array2[1][3]);
			String result2 = String.format("%5d %10d %10d %10d", array2[2][0], array2[2][1], array2[2][2], array2[2][3]);
			String result3 = String.format("%+5d %+10d %+10d %+10d", array2[3][0], array2[3][1], array2[3][2],
					array2[3][3]);
			//print
			System.out.println(result);
			System.out.println(result1);
			System.out.printf("%5s %10s %10s %10s \n\n\n", "___", "___", "___", "___");
			System.out.println(result2);
			System.out.println(result3);
			System.out.printf("%5s %10s %10s %10s ", "___", "___", "___", "___");
	
	}

}

//Output:
//	   33         99         98         84
//	   +30        +66        +41        +10
//	   ___        ___        ___        ___ 
//
//
//	    20         89         73         38
//	   +19        +71        +69        +96
//	   ___        ___        ___        ___ 
