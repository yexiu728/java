package day16.part1;

import java.io.File;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("D:\\a.txt");
        File file2 = new File("D:\\aaa");

        if (!file1.exists()) {
            File f = file1.getParentFile();
            f.mkdirs();
            file1.createNewFile();
        }
        if (!file2.exists()) {
            file2.mkdirs();
        }

        if(file1.isFile()) {
            System.out.println(file1.getName() + " 是文件");
        } else {
            System.out.println(file1.getName() + " 不是文件");
        }

        if (file2.isDirectory()) {
            System.out.println(file2.getName() + " 是文件夹");
        } else {
            System.out.println(file2.getName() + " 不是文件夹");
        }

    }
}
