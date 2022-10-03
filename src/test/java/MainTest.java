import org.junit.Test;
import org.uiuc.Main;

import static org.junit.Assert.assertEquals;

public class MainTest {

  @Test
  public void testPrintMessage() {
    assertEquals(50, Main.add(20, 30));
  }
}
