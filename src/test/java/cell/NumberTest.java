package cell;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberTest {

  @Test
  public void toString_integer() {
    assertEquals("50.0", new Number(50).toString());
  }
}