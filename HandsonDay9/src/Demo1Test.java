import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Demo1Test {
	@Test
	public void testStringConcat() {
		
		String res = Demo1.stringConcat("Shivam", "Tiwari");
		assertEquals("Shivam Tiwari", res);
		
		String str = Demo1.stringConcat("India", "New Delhi");
		assertEquals("India New Delhi", str); 
	}

}
