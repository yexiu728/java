package day17.part1;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("D:\\c.txt", true)) {
            fos.write("i love java\r\n".getBytes());
            fos.write("i love java\r\n".getBytes());
            fos.write("i love java\r\n".getBytes());
            fos.write("i love java\r\n".getBytes());
            fos.write("i love java\r\n".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
