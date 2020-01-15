package day17.part1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("开始输入数据：");

        try (FileOutputStream fos = new FileOutputStream("D:\\codeData\\info.txt")) {

            String data = "";
            while (true) {
                data = scan.nextLine().trim();
                if ("886".equals(data)) {
                    break;
                }
                fos.write(data.getBytes());
                fos.write("\r\n".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
