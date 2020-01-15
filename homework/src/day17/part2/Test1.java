package day17.part2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("现在开始录入数据(格式: 学号-学生名字)");
        Scanner scan = new Scanner(System.in);
        try (FileOutputStream fos = new FileOutputStream("D:\\codeData\\stu.txt")) {
            String data = "";

            while (true) {
                data = scan.nextLine().trim();
                if ("end".equals(data)) {
                    break;
                }
                if (data.split("-").length != 2) {
                    System.out.println("输入的格式不正确，请重新输入");
                    continue;
                }

                fos.write(data.getBytes());
                fos.write("\r\n".getBytes());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
