package day7.test5;

public class Test5 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Java");
        teacher.setName("王小平");
        teacher.jiangKe();

        Student student = new Student(90);
        student.setName("李小乐");
        student.kaoShi();

    }
}
