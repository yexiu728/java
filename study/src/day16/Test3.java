package day16;

import java.io.File;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        printFile(new File("study\\src\\day16"));
    }

    public static void printFile(File file) {
        if (file.isFile()) {
            System.out.println("文件: " + file.getAbsolutePath());
        } else {
            System.out.println("文件夹: " + file.getAbsolutePath());
            File[] files = file.listFiles();
            for (File f : files) {
                printFile(f);
            }
        }
    }
}
