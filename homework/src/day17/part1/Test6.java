package day17.part1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("D:\\a.png");
             FileOutputStream fos = new FileOutputStream("D:\\codeData\\a.png")
        ) {

            int data = 0;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
