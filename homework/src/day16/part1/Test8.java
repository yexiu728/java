package day16.part1;

import java.io.File;

public class Test8 {
    public static void main(String[] args) {
        File file = new File("D:\\");
        File[] files = file.listFiles();

        if (files != null) {
            for (File f : files) {
                System.out.println(f.getName());
            }
        }
    }
}
