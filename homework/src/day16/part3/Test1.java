package day16.part3;

import java.io.File;
import java.io.FileFilter;

public class Test1 {
    public static void main(String[] args) {
        printFile(new File("D:\\software\\Git"));
    }

    public static void printFile(File file) {
        if (!file.exists()) {
            System.out.println(file.getAbsolutePath() + " 不存在");
            return;
        }

        if (file.isFile()) {
            System.out.println(file.getAbsolutePath() + " 的大小是：" + file.length() + " B");
            return;
        }
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.length() <= 204800 || pathname.isDirectory();
            }
        });
        for (File f : files) {
            printFile(f);
        }
    }
}
