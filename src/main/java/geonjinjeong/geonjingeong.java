package geonjinjeong;

public class geonjingeong {
    //private 필드 변수 선언
    private String name;
    private String univ;
    private int age;
    private String address;


    //기본 생성자 생성
    public geonjingeong() {
    }

    //4개 인자 생성자 생성
    public geonjingeong(String name, String univ, int age, String address) {
        this.name = name;
        this.univ = univ;
        this.age = age;
        this.address = address;
    }

    //Getter& Setter 생성
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniv() {
        return univ;
    }

    public void setUniv(String univ) {
        this.univ = univ;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //toString override 생성 (String concat+ 방식)
    @Override
    public String toString() {
        return "geonjingeong{" +
                "name='" + name + '\'' +
                ", univ='" + univ + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
