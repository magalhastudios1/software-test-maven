package cell;

import static org.junit.Assert.*;

import org.junit.Test;

public class FloorTest {
    @Test
    public void toString_corner_remainsSame() {
        assertEquals("1.0", new Floor(1.0F).toString());
    }

    @Test
    public void toString_upper_toLower() {
        assertEquals("1.0", new Floor(1.5F).toString());
    }
}
