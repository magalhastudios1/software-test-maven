package cell;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExponentialTest {
    @Test
    public void toString_oneBase_returnsOne() {
        assertEquals("1.0", new Exponential(1, -2).toString());
        assertEquals("1.0", new Exponential(1, -1).toString());
        assertEquals("1.0", new Exponential(1, 0).toString());
        assertEquals("1.0", new Exponential(1, 1).toString());
        assertEquals("1.0", new Exponential(1, 2).toString());
    }

    @Test
    public void toString_twoBase_returnsPowerOfTwo() {
        assertEquals("0.25", new Exponential(2, -2).toString());
        assertEquals("0.5", new Exponential(2, -1).toString());
        assertEquals("1.0", new Exponential(2, 0).toString());
        assertEquals("2.0", new Exponential(2, 1).toString());
        assertEquals("4.0", new Exponential(2, 2).toString());
    }

    @Test
    public void toString_negativeBase_evenPower_returnsPositive() {
        assertEquals("4.0", new Exponential(-2, 2).toString());
    }

    @Test
    public void toString_negativeBase_oddPower_returnsNegative() {
        assertEquals("-8.0", new Exponential(-2, 3).toString());
    }
}
