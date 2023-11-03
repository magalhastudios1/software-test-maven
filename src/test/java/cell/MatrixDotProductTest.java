package cell;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sheet.Sheet;

public class MatrixDotProductTest {
    Sheet sheet;

    @Before public void setUp() {
       sheet = Sheet.getInstance(50, 50);
    }

    @Test
    public void calculate_emptyInterval_returnsZero() {
        assertEquals(0.F, new MatrixDotProduct(0, 0, 0, 0, 0, 0).calculate(), 0);
    }

    @Test
    public void calculate_oneElementIntervalIdentity_returnsElementProductValueSquared() {
        sheet.addElement(new Number(10), 0, 0);

        assertEquals(100.F, new MatrixDotProduct(0, 0, 1, 1, 0, 0).calculate(), 0);
    }

        @Test
    public void calculate_oneElementInterval_returnsElementsProductValue() {
        sheet.addElement(new Number(10), 0, 0);
        sheet.addElement(new Number(20), 1, 0);
        assertEquals(200.F, new MatrixDotProduct(0, 0, 1, 1, 1, 0).calculate(), 0);
    }

    @Test
    public void calculate_twoElementInterval_returnsMatrixDotProductValue() {
        sheet.addElement(new Number(10), 0, 0);
        sheet.addElement(new Number(5), 1, 0);

        sheet.addElement(new Number(20), 0, 1);
        sheet.addElement(new Number(5), 1, 1);

        assertEquals(225.F, new MatrixDotProduct(0, 0, 2, 1, 0, 1).calculate(), 0);
    }
}
