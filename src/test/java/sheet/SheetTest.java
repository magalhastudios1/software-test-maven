package sheet;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cell.Number;
import cell.Text;

public class SheetTest {
  @Before
  public void setUp() {
    Sheet.reset();
  }

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
    sheet.addElement(new Text("Hello!"), "Z25");

    assertEquals("Hello!", sheet.getElement("Z", "25").toString());
  }

  @Test
  public void printTable_zeroElement_returnsEmptyString() {
    Sheet sheet = Sheet.getInstance(0, 0);

    assertEquals("", sheet.printTable());
  }

  @Test
  public void printTable_oneElement_returnsTwoLines() {
    Sheet sheet = Sheet.getInstance(1, 1);
    sheet.addElement(new Text("Hello"), 0, 0);

    assertEquals("Hello\n", sheet.printTable());
  }

  @Test
  public void printTable_oneRow_returnsLine() {
    Sheet sheet = Sheet.getInstance(2, 1);
    sheet.addElement(new Text("Hello"), 0, 0);
    sheet.addElement(new Text("World"), 1, 0);

    assertEquals("Hello | World\n", sheet.printTable());
  }

  @Test
  public void printTable_twoRow_returnsTwoLines() {
    Sheet sheet = Sheet.getInstance(2, 2);
    sheet.addElement(new Text("Hello"), 0, 0);
    sheet.addElement(new Text("World"), 1, 0);

    sheet.addElement(new Number(10), 0, 1);
    sheet.addElement(new Number(20), 1, 1);

    assertEquals("Hello | World\n10.0 | 20.0\n", sheet.printTable());
  }
}