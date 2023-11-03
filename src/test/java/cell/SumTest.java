package cell;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import sheet.Sheet;

public class SumTest {
    Sheet sheet;

    @Before public void setUp() {
       sheet = new Sheet(50, 50);
    }

    @Test
    public void calculate_emptyInterval_returnsZero() {
        assertEquals(0.F, new Sum(0, 0, 0, 0).calculate(), 0);
    }

    @Test
    public void calculate_oneElementInterval_returnsZero() {
        sheet.addElement(new Number(50), 0, 0);
        assertEquals(50.F, new Sum(0, 1, 0, 1).calculate(), 0);
    }
}
