package w3l9_homework.prob1;

import java.util.Arrays;

public class ArrayQueueImpl {
	private int[] arr = new int[4];
	private int front = -1;
	private int rear =-1;
	private int size = 0;

	public int peek() {
		// implement
		if (arr.length == 0)
			return -1;
		else {
			return arr[front + 1];
		}

	}

	public void enqueue(int obj) {
		// implement
		if (arr.length == size)
			resize();
		if (front == -1)
			front = front + 1;
		arr[rear+1] = obj;
		rear++;
		size++;
	}

	public int dequeue() {
		if (arr.length == 0 || isEmpty() == true)
			return -1;
		int temp = arr[front];
		front++;
		size--;
		//rear--;
		return temp;

	}

	public boolean isEmpty() {
		if (size == 0)
			return true;
		return false;
	}

	public int size() {
		// implement
		return size;
	}

	private void resize() {
		// implement

		int tempLen;
		tempLen = 2 * arr.length;
		int[] temp = new int[tempLen];
		System.arraycopy(arr, 0, temp, 0, size);
		arr = temp;

	}

	public void print() {
		System.out.println(Arrays.toString(arr) + "front: " + front + " " + "rear: " + rear);
	}

}
