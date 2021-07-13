package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
    double expected2 = 2.5;
    assertEquals(expected2, calculate.twice_ave(2, 3), 0);
    expected = 55;
    assertEquals(expected, calculate.csum(1, 10));
    expected2 = 5.5;
    assertEquals(expected2, calculate.c_ave(1, 10), 0);
    expected = 25;
    assertEquals(expected, calculate.e_sum(1, 10, 1));
    expected = 30;
    assertEquals(expected, calculate.e_sum(1, 10, 0));
  }
}
