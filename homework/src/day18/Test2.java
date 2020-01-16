package day18;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("D:\\e.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
        ) {

            bos.write("i love java".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
