package test.java.stack;
import org.junit.*;

import main.java.stack.StackRPN;

import static org.junit.Assert.assertEquals;


public class StackRPNTest {
    @Test
    public void testIsNumeric() {
        StackRPN sut = new StackRPN();
        assertEquals(sut.isNumeric("5"), true);
        assertEquals(sut.isNumeric("test"), false);
        assertEquals(sut.isNumeric("2test"), false);
    }

    @Test
    public void testDoOperation() {
        StackRPN sut = new StackRPN();
        String op = "2 3 +";

        assertEquals(sut.doOperation(op), "5");
    }

    @Test
    public void testDoComplicatedOperation() {
        StackRPN sut = new StackRPN();
        String op = "12 2 3 4 * 10 5 / + * +";

        assertEquals(sut.doOperation(op), "40");

        op = "2 3 + 5 *";

        assertEquals(sut.doOperation(op), "25");

        op = "7 5 -";

        assertEquals(sut.doOperation(op), "-2");
    }

    @Test
    public void testPeekAfterOperation() {
        StackRPN sut = new StackRPN();
        String op = "12 2 3 4 * 10 5 / + * +";

        sut.doOperation(op);

        assertEquals(sut.peek(), null);
    }

    @Test
    public void testIntegerRangeExceedAdd() {
        StackRPN sut = new StackRPN();
        String op = "2147483646 1 + 2 +";

        // Przy przekroczeniu dziedziny wynik to null

        assertEquals(sut.doOperation(op), null);

        // Stos jest opróżniany

        assertEquals(sut.peek(), null);
    }

    @Test
    public void testIntegerRangeExceedSubtract() {
        StackRPN sut = new StackRPN();
        String op = "-2 2147483647 -";

        // Przy przekroczeniu dziedziny wynik to null

        assertEquals(sut.doOperation(op), null);

        // Stos jest opróżniany

        assertEquals(sut.peek(), null);
    }

    @Test
    public void testIntegerRangeExceedMultiply() {
        StackRPN sut = new StackRPN();
        String op = "2147483646 2 *";

        // Przy przekroczeniu dziedziny wynik to null

        assertEquals(sut.doOperation(op), null);

        // Stos jest opróżniany

        assertEquals(sut.peek(), null);
    }
}
