package cell;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sheet.Sheet;

public class MaxTest {
    Sheet sheet;

    @Before public void setUp() {
        Sheet.reset();
       sheet = Sheet.getInstance(50, 50);
    }

    @Test
    public void calculate_emptyInterval_returnMinFloat() {
        assertEquals(Float.MIN_VALUE, new Max(0, 0, 0, 0).calculate(), 0);
    }

    @Test
    public void calculate_oneElementInterval_returnsElementValue() {
        sheet.addElement(new Number(100), 0, 0);

        assertEquals(100.F, new Max(0, 1, 0, 1).calculate(), 0);
    }

    @Test
    public void calculate_twoElementInterval_returnMaxValue() {
        sheet.addElement(new Number(200), 0, 0);
        sheet.addElement(new Number(100), 1, 0);

        assertEquals(200.F, new Max(0, 2, 0, 1).calculate(), 0);
    }

    @Test
    public void calculate_matrixInterval_returnMaxValue() {
        sheet.addElement(new Number(200), 0, 0);
        sheet.addElement(new Number(100), 1, 0);
        sheet.addElement(new Number(300), 0, 1);
        sheet.addElement(new Number(400), 1, 1);

        assertEquals(400.F, new Max(0, 2, 0, 2).calculate(), 0);
    }

    @Test
    public void calculate_matrixIntervalWithNegativeValues_returnMaxValue() {
        sheet.addElement(new Number(100), 0, 0);
        sheet.addElement(new Number(-200), 1, 0);
        sheet.addElement(new Number(300), 0, 1);
        sheet.addElement(new Number(-400), 1, 1);

        assertEquals(300.F, new Max(0, 2, 0, 2).calculate(), 0);
    }
}
