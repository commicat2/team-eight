package jeongsujin;

import java.util.Objects;

public class JeongSujin {
    private String name;
    private int age;
    private int number;


    private JeongSujin() {
    }

    public JeongSujin(String name, int age, int number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("JeongSujin{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", number=").append(number);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        JeongSujin that = (JeongSujin) o;
        return age == that.age && number == that.number && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, number);
    }
}
