import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import sheet.Sheet;

public class TerminalTest {
    String ASSETS_PATH = "../assets/";
    
    @Before
    public void setUp() {
        Sheet.reset();
    }

    @Test
    public void getArea() {
        Sheet sheet = Terminal.readFile(ASSETS_PATH + "input_file_01.txt");
        assertEquals(1, sheet.getArea());
    }
}
