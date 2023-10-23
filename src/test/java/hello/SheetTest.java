package hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class SheetTest {

  @Test
  public void sheetArea() {
    assertEqual(new Sheet(50, 50).getArea(), 2500);
  }

}