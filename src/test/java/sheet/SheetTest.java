package sheet;

import static org.junit.Assert.*;

import org.junit.Test;

import cell.Text;

public class SheetTest {
  @Test
  public void getArea_oneInstance_returnsFirstInstanceArea() {
    assertEquals(2500, Sheet.getInstance(50, 50).getArea());
  }

  @Test
  public void getArea_twoInstance_returnsFirstInstanceArea() {
    Sheet.getInstance(50, 50);
    assertEquals(2500, Sheet.getInstance(40, 40).getArea());
  }

  @Test
  public void xStringToInteger_oneElement_A_returnsZero() {
    assertEquals(0, Sheet.xStringToInteger("A"));
  }

  @Test
  public void xStringToInteger_oneElement_B_returnsOne() {
    assertEquals(1, Sheet.xStringToInteger("B"));
  }

  @Test
  public void xStringToInteger_oneElement_Z_returns25() {
    assertEquals(25, Sheet.xStringToInteger("Z"));
  }

  @Test
  public void xStringToInteger_twoElement_AA_returns26() {
    assertEquals(26, Sheet.xStringToInteger("AA"));
  }

  @Test
  public void getElement_stringCoordenates_returnsElement() {
    Sheet sheet = Sheet.getInstance(50, 50);
    sheet.addElement(new Text("Hello!"), 25, 25);

    assertEquals("Hello", sheet.getElement("Z", "25").toString());
  }
}