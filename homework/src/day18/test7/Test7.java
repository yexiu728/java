package day18.test7;

import java.io.*;

public class Test7 {
    public static void main(String[] args) {
        Student stu = new Student("张良", 20, "男");
        String path = "D:\\codeData\\stu.txt";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))
        ) {

            oos.writeObject(stu);
            Student student = (Student) ois.readObject();
            System.out.println(student);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
