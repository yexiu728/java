package day16.part2;

import java.io.File;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入文件或文件夹：");
        File file = new File(scan.nextLine());

        if (!file.exists()) {
            System.out.println("文件或者文件夹不存在");
            return;
        }

        if (file.isFile()) {
            System.out.println("文件大小：" + file.length());
        } else {
            File[] files = file.listFiles();
            int count = 0;
            for (File f : files) {
                if(f.isFile()) {
                    count += f.length();
                }
            }
            System.out.println("该文件夹下的文件总大小为：" + (count / 1024) + " KB");
        }


    }
}
