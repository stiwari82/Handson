import static org.junit.Assert.assertEquals;

import org.junit.*;
public class PalindromeTest {
	@Test
	
	public void testCheckPalindrome() {
		Demo2  demo = new Demo2();
		boolean res = demo.palindromeCheck("MOM");
		assertEquals(true, res);
		
		boolean res1 = demo.palindromeCheck("OYE");
		assertEquals(true, res1);
	}

}

