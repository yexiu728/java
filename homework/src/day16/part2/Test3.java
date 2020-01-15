package day16.part2;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        getFile(new File("D:\\software\\Git"));
    }

    public static void getFile(File root) {
        if (root.isFile()) {
            System.out.println("文件：" + root.getAbsolutePath());
        } else {
            System.out.println("文件夹：" + root.getAbsolutePath());
            File[] files = root.listFiles();
            for (File f : files) {
                getFile(f);
            }
        }
    }
}
