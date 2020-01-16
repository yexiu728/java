package day18;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("D:\\d.txt");
             BufferedOutputStream bw = new BufferedOutputStream(fos)
        ) {

            bw.write(48);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
