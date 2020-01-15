package day17.part1;

import java.io.FileInputStream;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("D:\\b.txt")) {
            byte[] b = new byte[10];
            int len = 0;
            while ((len = fis.read(b)) != -1) {
                System.out.println(new String(b, 0, len));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
