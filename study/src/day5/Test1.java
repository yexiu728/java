package day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws FileNotFoundException {

        String str = "你好吗\n我很好";
        Scanner sc = new Scanner(new File("D:\\workspace\\前端基础\\xiangmu\\weibo\\19-12-18-新版本\\1.html"));

        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        // System.out.print("请输入：");

        // int i = sc.nextInt(); // 整型数据
        // String s1 = sc.next(); // 读取字符串
        // String s2 = sc.nextLine(); // 读取字符串

        // System.out.println("输入的是：" + sc.nextLine());
        // System.out.println("输入的是：" + sc.nextLine());

    }
}
