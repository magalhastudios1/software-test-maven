package cell;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberTest {

  @Test
  public void toString_integer() {
    assertEquals(new Number(50).toString(), "50");
  }
}