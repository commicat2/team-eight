package BakJiSeok;

public class BakJiSeok {
  private String a;
  private int b;

  public BakJiSeok(String a, int b) {
    this.a = a;
    this.b = b;
  }

  public BakJiSeok(String a) {
    this(a, 0);
  }

  public BakJiSeok() {
    this("", 0);
  }

  public String getA() {
    return a;
  }

  public void setA(String a) {
    this.a = a;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }

  @Override
  public String toString() {
    return "BakJiSeok{" +
        "a='" + a + '\'' +
        ", b=" + b +
        '}';
  }
}
