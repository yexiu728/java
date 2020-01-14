package day9.test2;

public class Student {
    private String name;
    private String chuQin;

    public Student() {
    }

    public Student(String name, String chuQin) {
        this.name = name;
        this.chuQin = chuQin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChuQin() {
        return chuQin;
    }

    public void setChuQin(String chuQin) {
        this.chuQin = chuQin;
    }
}
