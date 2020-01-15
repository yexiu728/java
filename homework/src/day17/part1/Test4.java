package day17.part1;

import java.io.FileInputStream;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("D:\\a.txt")) {
            int data = 0;
            while ((data = fis.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
