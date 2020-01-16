package day18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try (PrintStream ps = new PrintStream("D:\\codeData\\d.txt")) {

            System.out.println("请输入任意内容：");
            System.setOut(ps);
            System.out.println(scan.nextLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
