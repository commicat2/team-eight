package BakJiSeok;

import java.util.Optional;

public class BakJiSeok {
  private Optional<String> name;
  private int age;

  public BakJiSeok(String name, int age) {
    this.name = Optional.ofNullable(name);
    this.age = age;
  }

  public BakJiSeok(String name) {
    this(name, 0);
  }

  public BakJiSeok() {
    this("", 0);
  }

  public Optional<String> getName() {
    return name;
  }

  public void setName(Optional<String> name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "BakJiSeok{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
