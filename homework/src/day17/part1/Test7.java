package day17.part1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("D:\\a.png");
             FileOutputStream fos = new FileOutputStream("D:\\codeData\\a.png")
        ) {

            int len = 0;
            byte[] b = new byte[24];
            while ((len = fis.read(b)) != -1) {
                fos.write(b, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
