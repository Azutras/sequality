package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double twice_ave(int x, int y) {
    return this.sum(x, y) / 2.0;
  }

  public int csum(int x, int y) {
    int sum = 0;
    for (int i = (int) x; i <= y; i++) {
      sum = this.sum(sum, i);
    }
    return sum;
  }

  public double c_ave(int x, int y) {
    int sum = this.csum(x, y);
    int count = Math.abs(y - x) + 1;
    return (double) sum / count;
  }

  public int odd(int x, int y) {
    int sum = 0;
    if (x % 2 == 0)
      x++;
    if (y < x) {
      int tmp = x;
      x = y;
      y = tmp;
    }
    for (int i = x; i <= y; i += 2) {
      sum = this.sum(sum, i);
    }
    return sum;
  }

  public int even(int x, int y) {
    int sum = 0;
    if (x % 2 != 0)
      x++;
    if (y < x) {
      int tmp = x;
      x = y;
      y = tmp;
    }
    for (int i = x; i <= y; i += 2) {
      sum = this.sum(sum, i);
    }
    return sum;
  }
}
