package day18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {
    public static void main(String[] args) {
        String path = "D:\\codeData\\a.txt";
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(path), "GBK")) {

            char[] c = new char[32];
            int len = 0;
            while ((len = isr.read(c)) != -1) {
                System.out.println(new String(c, 0, len));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
