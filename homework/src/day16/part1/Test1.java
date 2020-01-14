package day16.part1;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        File file1 = new File("D:\\workspace\\java\\homework\\src\\day16\\part1\\Test1.java");
        File file2 = new File("homework\\src\\day16\\part1", "Test1.java");

        System.out.println("file1是否存在：" + file1.exists());
        System.out.println("file2是否存在：" + file2.exists());
    }
}
