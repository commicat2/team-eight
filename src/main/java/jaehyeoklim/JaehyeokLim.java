package jaehyeoklim;

public class JaehyeokLim {

    private String name;
    private int age;

    public JaehyeokLim(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "JaehyeokLim{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
