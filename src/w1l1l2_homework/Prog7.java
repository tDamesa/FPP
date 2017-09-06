package w1l1l2_homework;


public class Prog7 {
	public static void main(String [] args){
		int count=0;
		for (int i=0;i<args.length;i++){
			System.out.println(args[i].length());
			if(args[i].charAt(0)=='A')
				count++;
		}
		System.out.println("Words stars with A:"+count);

	}
}

//Input:
//	FPP MPP Hello Apple Anna
//
//Output:
//	3
//	3
//	5
//	5
//	4
//	Words stars with A:2