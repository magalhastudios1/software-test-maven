package cell;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberTest {

  @Test
  public void toString_integer_negative_floatStringWithTrace() {
    assertEquals("-50.0", new Number(-50).toString());
  }

  @Test
  public void toString_integer_positive_floatString() {
    assertEquals("50.0", new Number(50).toString());
  }
  
  @Test
  public void toString_float_negative_floatStringWithTrace() {
    assertEquals("-50.0", new Number(-50.0).toString());
  }

  @Test
  public void toString_float_positive_floatString() {
    assertEquals("50.0", new Number(50.0).toString());
  }
}