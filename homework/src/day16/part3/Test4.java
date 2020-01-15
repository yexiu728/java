package day16.part3;

import java.io.File;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要打印的文件夹：");
        File file = new File(scan.nextLine()); // "D:\\aaa"
        printFile(file);
    }

    public static void printFile(File file) {
        if (!file.exists()) {
            System.out.println(file.getAbsolutePath() + " 不存在");
            return;
        }

        if (file.isDirectory()) {
            System.out.println(file.getName());
            // 先打印文件
            File[] files = file.listFiles(f -> {
                return f.isFile();
            });
            for (File f : files) {
                System.out.println(f.getName());
            }

            // 后打印内部文件夹
            files = file.listFiles(p -> {
                return p.isDirectory();
            });
            for (File f : files) {
                printFile(f);
            }

        } else {
            System.out.println(file.getName());
        }
    }

}
