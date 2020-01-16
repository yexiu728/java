package day18;

import day18.test7.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test8 {
    public static void main(String[] args) {
        String path = "D:\\codeData\\stu.txt";
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {

            Student stu = (Student) ois.readObject();
            System.out.println(stu);

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
