package BakJiSeok;

public class BakJiSeok {
  private String name;
  private int agee;


  public BakJiSeok(String name, int agee) {
    this.name = name == null ? "x" : name;
    this.agee = agee;
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

  public int getAgee() {
    return agee;
  }

  public void setAgee(int agee) {
    this.agee = agee;
  }

  @Override
  public String toString() {
    return "BakJiSeok{" +
        "name='" + name + '\'' +
        ", age=" + agee +
        '}';
  }
}
