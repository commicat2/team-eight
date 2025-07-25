package BakJiSeok;

public class BakJiSeok {
  private String name;
  private int age;


  public BakJiSeok(String name, int age) {
    this.name = name == null ? "" : name;
    this.age = age;
  }

  public BakJiSeok(String name) {
    this(name, 0);
  }

  private BakJiSeok() {
  }

  public String getName() {
    return name == null ? "" : name;
  }

  public void setName(String name) {
    this.name = name == null ? "" : name;
  }

  public int getAg() {
    return ag;
  }

  public void setAg(int ag) {
    this.ag = ag;
  }

  @Override
  public String toString() {
    return "BakJiSeok{" +
        "name='" + name + '\'' +
        ", age=" + ag +
        '}';
  }
}
