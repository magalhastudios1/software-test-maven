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
        sheet.addElement(new Number(50), 0, 0);
        assertEquals(50.F, new Sum(0, 1, 0, 1).calculate(), 0);
    }

    @Test
    public void calculate_twoElementInterval_returnsSumValue() {
        sheet.addElement(new Number(50), 0, 0);
        sheet.addElement(new Number(70), 1, 0);
        assertEquals(120.F, new Sum(0, 2, 0, 1).calculate(), 0);
    }
}
