package w1l5_homework.prob3;


public class Driver {

	public static void main(String[] args) {
		Figure[] fig = { new UpwardHat(), new UpwardHat(), new DownwardHat(), new FaceMaker(), new Vertical() };
		
		for (Figure x : fig) {
			x.getFigure();
		

		}
		System.out.println();
		for (Figure x : fig) {
			System.out.print(x.getClass().getSimpleName() + ": ");
			x.getFigure();
			System.out.println();

		}
	}
}
/*Output
/\/\\/:)||
UpwardHat: /\
UpwardHat: /\
DownwardHat: \/
FaceMaker: :)
Vertical: ||
*/