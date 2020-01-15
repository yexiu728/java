package day16.part2;

import java.io.File;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要计算大小的文件夹：");
        File file = new File(scan.nextLine()); // D:\software\Git
        long size = calculate(file);
        System.out.println(file.getAbsolutePath() + " 的大小为：" + (size / 1024 / 1024) + "MB");
    }

    public static long calculate(File file) {
        // 不存在
        if (!file.exists()) {
            System.out.println(file.getAbsolutePath() + " 不存在");
            return 0;
        }
        long size = 0;
        // 文件
        if (file.isFile()) {
            return file.length();
        }
        // 文件夹
        File[] files = file.listFiles();
        for (File f : files) {
            size += calculate(f);
        }
        return size;
    }
}
