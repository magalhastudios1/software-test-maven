package cell;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {
    @Test
    public void calculate_emptyInterval_returnsZero() {
      assertEquals(0.F, new Sum(0, 0, 0, 0).calculate(), 0);
    }
}
