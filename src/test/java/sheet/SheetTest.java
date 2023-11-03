package sheet;

import static org.junit.Assert.*;

import org.junit.Test;

public class SheetTest {

  @Test
  public void sheetArea() {
    assertEquals(new Sheet(50, 50).getArea(), 2500);
  }

}