package w1l5_homework.prob5;

public class Main {
	public static void main(String[] args) {
		Computer obj = new Computer("Dell", "128", 4, 1000, 2);
		Computer obj1 = new Computer("Hp", "128", 4, 1000, 4);
		System.out.println(obj.equals(obj1));
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());

	}
}
/*Output:
 true
49709
49709
*/