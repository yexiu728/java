package day17.part1;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("D:\\b.txt")) {
            fos.write("你好".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
