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
    public void getArea_oneInstance_returnsFirstInstanceArea() {
        assertEquals(2500, Sheet.getInstance(50, 50).getArea());
    }
}
