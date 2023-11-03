package cell;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sheet.Sheet;

public class ConcatenateTest {
    Sheet sheet;

    @Before public void setUp() {
       sheet = Sheet.getInstance(50, 50);
    }

    @Test
    public void calculate_emptyInterval_returnsEmptyString() {
        assertEquals("", new Concatenate(0, 0, 0, 0).toString());
    }

    @Test
    public void calculate_oneElementInterval_number_returnsElementString() {
        sheet.addElement(new Number(100), 0, 0);

        assertEquals("100.0", new Concatenate(0, 1, 0, 1).toString());
    }

    @Test
    public void calculate_oneElementInterval_text_returnsElementString() {
        sheet.addElement(new Text("Hello"), 0, 0);

        assertEquals("Hello", new Concatenate(0, 1, 0, 1).toString());
    }

    @Test
    public void calculate_twoElementInterval_number_returnsConcatenateValue() {
        sheet.addElement(new Number(100), 0, 0);
        sheet.addElement(new Number(100), 1, 0);

        assertEquals("100.0100.0", new Concatenate(0, 2, 0, 1).toString());
    }

    @Test
    public void calculate_twoElementInterval_text_returnsConcatenateValue() {
        sheet.addElement(new Text("Hello"), 0, 0);
        sheet.addElement(new Text(" World"), 1, 0);

        assertEquals("Hello World", new Concatenate(0, 2, 0, 1).toString());
    }

    @Test
    public void calculate_twoElementInterval_numberAndText_returnsConcatenateValue() {
        sheet.addElement(new Number(100), 0, 0);
        sheet.addElement(new Text("Hundred"), 1, 0);

        assertEquals("100.0Hundred", new Concatenate(0, 2, 0, 1).toString());
    }

    @Test
    public void calculate_matrixInterval_returnsConcatenateValue() {
        sheet.addElement(new Text("My"), 0, 0);
        sheet.addElement(new Text(" First"), 1, 0);
        sheet.addElement(new Text(" Hello"), 0, 1);
        sheet.addElement(new Text(" World"), 1, 1);

        assertEquals("My First Hello World", new Concatenate(0, 2, 0, 2).toString());
    }
}
