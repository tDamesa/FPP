package w3l8_homework_day2.prob1;

public class MyStringLinkedList {
	// only need header to access
	static Node header;

	// constractor
	MyStringLinkedList() {
		header = null;
	}

	public void addFront(String item) {
		// check the header is null
		if (header == null)
			header = new Node(null, item, null);
		else {
			// create a node
			Node n = new Node(null, item, header);
			header.previous = n;
			header = n;
		}
	}

	// Implement the code

	public void addLast(String item) {
		Node lastNode = findLast();
		Node newNode = new Node(lastNode, item, null);
		lastNode.next = newNode;
	}

	// Find last node/get last
	public Node findLast(String value) {
		if (header == null) {
			header = new Node(null, value, null);
			return header;
		} else {
			for (Node i = header; i != null; i = i.next) {
				if (i.next == null)
					return i;
			}
			return null;
		}
	}

	// implement the code
	public void postAddNode(Node n, String value) {
		Node newNode;
		if (n == null) {
			newNode = new Node(null, value, null);
			header = newNode;
		} else if (n.next == null) {
			addLast(value);
		} else {
			newNode = new Node(n, value, n.next.previous);
			n.next = newNode;
			n.previous = newNode;
		}

	}
	// implement the code

	public int Size() {
		int count = 0;
		for (Node i = header; i != null; i = i.next) {
			count++;
		}
		return count;
	}

	// implement code
	public boolean isEmpty() {
		if (header == null)
			return true;
		return false;
	}

	// get first
	public Node getFirst() {
		return header;
	}

	// remove first
	public void removeFirst() {
		if (isEmpty() == true)
			return;
		Node temp = header.next;
		header.next.previous = null;
		header = null;
		header = temp;

	}

	// remove first
	public void removeLast() {
		if (isEmpty() == true)
			return;
		Node lastNode = findLast();
		Node temp = lastNode.previous;
		lastNode.previous.next = null;
		lastNode = null;
		lastNode = temp;

	}

	// print min
	public void printMin() {
		Node min = header;
		if (isEmpty() == true)
			return;
		if (header.next == null)
			System.out.println(header);
		else

			for (Node i = header; i != null; i = i.next) {
				if (i.value.compareTo(min.value) < 0) {
					min = i;
				}
			}
		System.out.println(min);
	}

	// print max
	public void printMax() {
		Node max = header;
		if (isEmpty() == true)
			return;
		if (header.next == null)
			System.out.println(header);
		else {
			for (Node i = header.next; i != null; i = i.next) {
				if (i.value.compareTo(max.value) > 0) {
					max.value=i.value;
					max = i;
				}
			}
			System.out.println(max);
		}

	}

	// print
	public void print(Node n) {
		if (n == null)
			return;
		else {
			System.out.println(n);
			print(n.next);
		}

	}
	 public void helperMethod(){
	 print(header);
	 }

	// add node previous to n
	public void preAddNode(Node n, String value) {
		Node newNode;
		// addfront method
		if (n == null) {
			// List is empty
			newNode = new Node(null, value, null);
		} else if (n.previous == null) {
			// n is the first node
			addFront(value);
		} else {
			// n.per
			newNode = new Node(n.previous, value, n);
			n.previous.next = newNode;
			n.previous = newNode;
		}

	}

	//
	public Node findLast() {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;
			return temp;
		}
	}

	//
	public Node findItem(String str) {
		if (header == null)
			return null;
		else {
			// statrt from the header
			Node temp = header;
			while (temp != null) {
				if (str.equals(temp.value))
					return temp;
				else
					temp = temp.next;
			}
			return null;
		}
	}

	//
	public void deleteNode(Node n) {
		// get the node from findNode methode
		if (header != null && n != null) {
			// removing the header
			if (n.next == null && n.previous == null) {
				// only one node: header
				header = null;
				n = null;
				System.out.println("I am here 1");
				// removing the header and the next node becomes header
			} else if (n.previous == null) {
				// remove first node
				n.next.previous = null;
				header = n.next;
				n = null;
				System.out.println("I am here 2");
				//
			} else if (n.next == null) {
				// remove last node
				n.previous.next = null;
				n = null;
				System.out.println("I am here 3");
			} else {
				// general case
				n.next.previous = n.previous;
				n.previous.next = n.next;
				n = null;
				System.out.println("I am here 4");
			}

		}

	}

	// delete all the list
	public void deleteList() {
		Node tempOne = header;
		Node tempTwo = header;
		while (tempOne != null) {
			tempOne = tempOne.next;
			tempTwo = null;
			tempTwo = tempOne;
		}
		header = null;
	}

	public String toString() {
		String str = "";
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	public void printReverse() {
		String str = "";
		Node temp = findLast();
		while (temp != null) {
			str = str + "==>[" + temp.value.toString() + "]";
			temp = temp.previous;
		}
		str = str + "==>[" + "NULL" + "]";
		System.out.println(str);
	}

	// inner class node structure
	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		
		mySL.postAddNode(mySL.findItem("Blueberry Muffin"), "Carrot Cake");
		mySL.addLast("Cheese Cake");
		mySL.addLast("Apple juice");
		mySL.addLast("Hello World");
		System.out.println(mySL.Size());
		System.out.println(mySL.isEmpty());
		System.out.println(mySL.getFirst());
		System.out.println(mySL.findLast());
		mySL.removeFirst();
		System.out.println(mySL);
		mySL.removeLast();
		System.out.println(mySL);
		mySL.printMin();
		mySL.printMax();
		mySL.helperMethod();
		
	}

}
/*Output:
 * 4
false
Carrot Cake
Hello World
-->[Cheese Cake]-->[Apple juice]-->[Hello World]-->[NULL]
-->[Cheese Cake]-->[Apple juice]-->[NULL]
Apple juice
Cheese Cake
Cheese Cake
Apple juice
*/