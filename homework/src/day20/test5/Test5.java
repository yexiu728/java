package day20.test5;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入类名(day20.test5.A)：");
        String text = scan.next();

        Class clazz = Class.forName(text);
        A a = (A) clazz.newInstance();
        a.showString();

    }
}
