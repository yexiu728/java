package day16.part2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入文件路径");
        String fileName = scan.nextLine();

        File file = new File(fileName);
        if (file.exists()) {
            System.out.println(file.getName() + " 的大小为：" + file.length());
        } else {
            try {
                boolean b = file.createNewFile();
                System.out.println("文件不存在，已创建：" + b);
            } catch (IOException e) {
                System.out.println("输入格式不正确或者文件所在目录不存在");
            }
        }
    }
}
