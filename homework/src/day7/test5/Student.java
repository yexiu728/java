package day7.test5;

public class Student extends Person {
    private int fenShu;

    public Student() {
    }

    public Student(int fenShu) {
        this.fenShu = fenShu;
    }

    public void kaoShi() {
        System.out.println(this.getName() + "同学，考试得了：" + fenShu + "分");
    }

    public int getFenShu() {
        return fenShu;
    }

    public void setFenShu(int fenShu) {
        this.fenShu = fenShu;
    }
}
