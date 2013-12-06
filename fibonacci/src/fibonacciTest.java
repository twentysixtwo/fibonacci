import static org.junit.Assert.*;

import org.junit.Test;


public class fibonacciTest {

	@Test
	public void test() {
		fibonacci fib = new fibonacci();
		
		assertEquals("fibonacci 6 is 8", 8, fib.check(6));
		assertEquals("fibonacci 12 is 144", 144, fib.check(12));
		assertEquals("fibonacci 20 is 6765", 6765, fib.check(20));
	}

}
