package cell;

import static org.junit.Assert.*;

import org.junit.Test;

public class CeilTest {
    @Test
    public void toString_corner_remainsSame() {
        assertEquals("1.0", new Ceil(1.0F).toString());
    }

    @Test
    public void toString_lower_toUpper() {
        assertEquals("2.0", new Ceil(1.5F).toString());
    }
}
