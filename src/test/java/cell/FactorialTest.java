package cell;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {
    @Test
    public void toString_zero_returnsOne() {
        assertEquals("1.0", new Factorial(0).toString());
    }

    @Test
    public void toString_one_returnsOne() {
        assertEquals("1.0", new Factorial(1).toString());
    }

    @Test
    public void toString_two_returnsOne() {
        assertEquals("2.0", new Factorial(2).toString());
    }

    @Test
    public void toString_three_returnsOne() {
        assertEquals("6.0", new Factorial(3).toString());
    }
}
