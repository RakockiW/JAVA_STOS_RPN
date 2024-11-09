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

	@Test
	public void testMultiplePush() {
		Stack stack = new Stack();
		stack.push("napis1");
		String result1 = stack.peek();
		stack.push("napis2");
		String result2 = stack.peek();
		String result3 = stack.pop();
		String result4 = stack.peek();
		assertEquals("First push", "napis1", result1);
		assertEquals("Second push", "napis2", result2);
		assertEquals(result3, "napis2");
		assertEquals(result4, "napis1");
	}

	@Test 
	public void testPeekAfterPeek() {
		Stack stack = new Stack();
		stack.push("napis");
		String firstPeek = stack.peek();
		String secondPeek = stack.peek();

		assertEquals("peek after peek", firstPeek, secondPeek);	
	}

	@Test
	public void testPeekAfterPop() {
		Stack stack = new Stack();
		stack.push("napis1");
		stack.push("napis2");
		stack.pop();
		String result = stack.peek();

		assertEquals("peek after pop", "napis1", result);
	}

	@Test
	public void testPopOnEmptyStack() {
		Stack stack = new Stack();
		String result = stack.pop();

		assertEquals("pop on empty stack", null, result);
	}

	@Test
	public void testPeekOnEmptyStack() {
		Stack stack = new Stack();
		String result = stack.peek();

		assertEquals("peek on empty stack", null, result);
	}
}	

