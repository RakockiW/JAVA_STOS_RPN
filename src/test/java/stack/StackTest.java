package test.java.stack;
import org.junit.*;

import main.java.stack.Stack;

import static org.junit.Assert.assertEquals;

public class StackTest {
	@Test
	public void testPopAfterPush() {
		Stack stack = new Stack();
		stack.push("napis");
		String result = stack.pop();

		assertEquals("pop after push", "napis", result);
	}

	@Test 
	public void testPeekAfterPush() {
		Stack stack = new Stack();
		stack.push("napis");
		String result = stack.peek();

		assertEquals("peek after push", "napis", result);
	}
}
