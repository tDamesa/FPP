package w1l4_homework;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchClassTest {


	
	int test  = -1;
	String word="hi";
	char key='e';
	
	
	@Test
	public void testMyBinarySearch() {

		//assertEquals(test, BinarySearchClass.myBinarySearch(word, key, 0, word.length()));
		assertEquals(0, BinarySearchClass.myBinarySearch("hello", 'h', 0,5));
	}

}
