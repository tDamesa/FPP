package w1l4_homework;

import static org.junit.Assert.*;

import org.junit.Test;

public class MergeStringTest {

	String expected = "abcdef";
	@Test
	public void testMerge() {
		
		assertEquals(expected, MergeString.merge("ace", "bdf"));

	
	}

}
