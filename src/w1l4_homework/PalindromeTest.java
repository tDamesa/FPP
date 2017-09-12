package w1l4_homework;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {
	
	@Test
	public void testIspalindrome() {
		
		//assertTrue(Palindrome.ispalindrome("madam"));
		assertFalse(Palindrome.ispalindrome("hello"));

	}

}
