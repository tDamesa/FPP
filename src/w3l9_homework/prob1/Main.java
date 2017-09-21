package w3l9_homework.prob1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		ArrayQueueImpl ar = new ArrayQueueImpl();
		ar.enqueue(1);
		ar.enqueue(2);
		ar.enqueue(3);
		ar.enqueue(4);
		ar.enqueue(7);
		ar.print();
		System.out.println("Removed value: "+ar.dequeue());
		ar.print();
		System.out.println("isEmpity: "+ar.isEmpty());
		System.out.println("Size: "+ ar.size());
		ar.enqueue(7);
		ar.print();
	}

}
/*Output: 
 [1, 2, 3, 4, 7, 0, 0, 0]front: 0 rear: 4
Removed value: 1
[1, 2, 3, 4, 7, 0, 0, 0]front: 1 rear: 4
isEmpity: false
Size: 4
[1, 2, 3, 4, 7, 7, 0, 0]front: 1 rear: 5
 */
