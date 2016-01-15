package me.jonathanhuang.fibonacci;
import static org.junit.Assert.*;

import org.junit.Test;


public class fibonacciTest {

	@Test
	public void test() {
		fibonacci fib = new fibonacci();
		assertEquals("fibonacci 6 is 8", 8, fib.check(6));
		assertEquals("fibonacci 12 is 144", 144, fib.check(12));
		assertEquals("fibonacci 20 is 6765", 6765, fib.check(20));
		assertEquals("fibonacci 1 is 1", 1, fib.check(1));
		assertEquals("fibonacci 0 is 0", 0, fib.check(0));
		assertEquals("fibonacci -1 is undefined. return 0", 0, fib.check(-1));
	}

}
