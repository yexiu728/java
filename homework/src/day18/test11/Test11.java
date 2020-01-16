package day18.test11;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test11 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 23, "男"));
        list.add(new Student("李四", 24, "男"));
        list.add(new Student("王五", 25, "女"));
        list.add(new Student("赵六", 26, "男"));

        String path = "D:\\codeData\\stus.txt";

        try (ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream(path))) {

            ois.writeObject(list);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
