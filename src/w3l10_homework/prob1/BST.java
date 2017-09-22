package w3l10_homework.prob1;

public class BST {
	class BinaryNode {
		BinaryNode left;
		BinaryNode right;
		int value;

		BinaryNode(BinaryNode left, int value, BinaryNode right) {
			this.left = left;
			this.value = value;
			this.right = right;
		}
	}

	BinaryNode root;
	int value;

	public void insert(int x) {
		if (root == null) {
			root = new BinaryNode(null, x, null);
		}

		else {
			BinaryNode n = root;
			while (true) {

				if (x < n.value) {
					if (n.left == null) {
						n.left = new BinaryNode(null, x, null);
						break;

					} else {
						n = n.left;

					}

				} else if (x > n.value) {
					if (n.right == null) {
						n.right = new BinaryNode(null, x, null);
						break;
					} else {
						n = n.right;
					}
				} else {
					break;
				}
			}

		}

	}

	public void preOrder() {
		if (root == null)
			System.out.println("Empty tree");
		else

			preOrder(root);
	}

	private void preOrder(BinaryNode t) {
		if (t != null) {
			System.out.print(t.value + " ");
			preOrder(t.left);
			preOrder(t.right);
		}
	}

	public void postOrder() {
		if (root == null)
			System.out.println("Empty tree");
		else

			postOrder(root);
	}

	private void postOrder(BinaryNode t) {
		if (t != null) {
			postOrder(t.left);
			postOrder(t.right);
			System.out.print(t.value + " ");

		}
	}

	public boolean contains(Integer key) {
		return containsHelper(key, root);
	}

	private boolean containsHelper(Integer key, BinaryNode n) {
		boolean result = false;
		if (n == null)
			return result;
		if (key == n.value)
			return true;
		else {
			if (key > n.value) {
				result = containsHelper(key, n.right);
			} else if (key < n.value) {
				result = containsHelper(key, n.left);
			}

		}

		return result;
	}

	public Integer getRoot() {
		int n = root.value;
		return n;
	}

	public Integer leafNodes() {
		return leafNodes(root);
	}

	int countLeafNodes = 0;

	private int leafNodes(BinaryNode t) {

		if (t != null) {
			if (t.left == null && t.right == null) {
				countLeafNodes++;
			}
			leafNodes(t.right);
			leafNodes(t.left);
		}
		return countLeafNodes;
	}

	public Integer size() {
		return sizeHelper(root);
	}

	int sizeCount = 0;

	private int sizeHelper(BinaryNode n) {
		if (n != null) {
			sizeCount++;
			sizeHelper(n.right);
			sizeHelper(n.left);
		}
		return sizeCount;

	}

	public boolean isEmpty() {
		if (root == null)
			return true;
		return false;

	}

	public Integer findMin() {
		return findMinHelper(root, root.value);
	}

	private Integer findMinHelper(BinaryNode n, int min) {
		if (n != null) {
			if (n.value < min)
				min = n.value;
			min = findMinHelper(n.left, min);
		}

		return min;
	}

	public Integer findMax() {
		return findMaxHelper(root, root.value);
	}

	public Integer findMaxHelper(BinaryNode n, int max) {
		if (n != null) {
			if (n.value > max)
				max = n.value;
			max = findMaxHelper(n.right, max);
		}

		return max;
	}

	public static void main(String[] args) {

		BST mybst = new BST();

		int[] a = { 15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25 };

		for (int j = 0; j < a.length; j++) {
			mybst.insert(a[j]);

		}

		 mybst.insert(12);
		 System.out.println("preOrder");
		 mybst.preOrder();
		 System.out.println();
		 System.out.println("postOrder");
		 mybst.postOrder();
		 System.out.println();
		 System.out.println("The root contains: "+ mybst.contains(10));
		 System.out.println("The root: "+mybst.getRoot());
		 System.out.println("The number of leafNodes:"+mybst.leafNodes());
		 System.out.println("The size: "+mybst.size());
		 System.out.println("Is empty: "+mybst.isEmpty());
		 System.out.println("Min value: "+ mybst.findMin());
		 System.out.println("Max value: "+mybst.findMax());

	}
}
/*Output
 preOrder
15 12 9 1 3 2 56 16 19 22 25 100 
postOrder
2 3 1 9 12 25 22 19 16 100 56 15 
The root contains: false
The root: 15
The number of leafNodes:3```````
The size: 12
Is empty: false
Min value: 1
Max value: 100 */
