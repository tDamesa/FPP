package w3l9_homework.prob2;

import java.awt.List;

public class LinkedList_Stack implements Stack {
	//Inner class Node
	class Node {
		Node previous;
		Node next;
		Object data;

		Node(Node previous, Object item, Node next) {
			this.data = item;
			this.previous = previous;
			this.next = next;
		}

	}

	Node top;
	int size;

	public LinkedList_Stack() {
		top = null;
		size = 0;
	}

	@Override
	public void push(Object value) {
		Node n;
		if (top == null) {
			n = new Node(null, value, null);
			top = n;

		} else {
			n = new Node(top, value, null);
			top.next = n;
			top = n;
		}

		size++;
	}

	@Override
	public Object pop() {
		Node temp;
		if (top == null) {
			return null;
		} else {
			temp = top;
			top.previous.next = null;
			top = top.previous;
			size--;
			return temp.data;
		}

	}

	@Override
	public Object peek() {
		if (top == null) {
			return null;
		} else {
			for (Node i = top; i != null; i = i.previous) {
				if (i.previous == null)
					return i.data;
			}
		}
		return null;
	}

	@Override
	public int size() {

		return size;
	}

	@Override
	public boolean isEmpty() {
		if (top == null)
			return true;
		return false;
	}

	public void print() {
		Node temp = top;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.previous;
		}

	}

	public static void main(String[] args) {
		LinkedList_Stack list = new LinkedList_Stack();
		list.push(12);
		list.push(13);
		list.push(1);
		list.push(15);
		list.push(17);
		list.print();
		System.out.println("popped value ; " + list.pop());
		// list.print();
		System.out.println("Peek value: "+ list.peek());
		System.out.println("size: "+list.size);
		System.out.println("isEmpty: "+list.isEmpty());

	}

}
/*Output:
 17
15
1
13
12
popped value ; 17
Peek value: 12
size: 4
isEmpty: false
*/
