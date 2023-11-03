package cell;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sheet.Sheet;

public class SumTest {
    Sheet sheet;

    @Before public void setUp() {
       sheet = Sheet.getInstance(50, 50);
    }

    @Test
    public void calculate_emptyInterval_returnsZero() {
        assertEquals(0.F, new Sum(0, 0, 0, 0).calculate(), 0);
    }

    @Test
    public void calculate_oneElementInterval_returnsElementValue() {
        sheet.addElement(new Number(100), 0, 0);

        assertEquals(100.F, new Sum(0, 1, 0, 1).calculate(), 0);
    }

    @Test
    public void calculate_twoElementInterval_returnsSumValue() {
        sheet.addElement(new Number(100), 0, 0);
        sheet.addElement(new Number(100), 1, 0);

        assertEquals(200.F, new Sum(0, 2, 0, 1).calculate(), 0);
    }

    @Test
    public void calculate_matrixInterval_returnsSumValue() {
        sheet.addElement(new Number(100), 0, 0);
        sheet.addElement(new Number(100), 1, 0);
        sheet.addElement(new Number(100), 0, 1);
        sheet.addElement(new Number(100), 1, 1);

        assertEquals(400.F, new Sum(0, 2, 0, 2).calculate(), 0);
    }

    @Test
    public void calculate_matrixIntervalWithNegativeValues_returnsSumValue() {
        sheet.addElement(new Number(100), 0, 0);
        sheet.addElement(new Number(-100), 1, 0);
        sheet.addElement(new Number(-100), 0, 1);
        sheet.addElement(new Number(100), 1, 1);

        assertEquals(0.F, new Sum(0, 2, 0, 2).calculate(), 0);
    }
}
