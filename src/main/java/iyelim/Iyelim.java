package iyelim;

import java.util.Objects;

public class Iyelim {
    private String name;
    private int age;

    public Iyelim() {
    }

    public Iyelim(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Iyelim iyelim = (Iyelim) object;
        return age == iyelim.age && Objects.equals(name, iyelim.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Iyelim{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
