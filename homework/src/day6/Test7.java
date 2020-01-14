package day6;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {

        System.out.println("请输入一个QQ 号码：");
        Scanner scan = new Scanner(System.in);
        String qq = scan.nextLine();
        System.out.println("这个QQ 号码是否正确：" + checkQQ(qq));

    }

    public static boolean checkQQ(String qq) {
        boolean flag = true;

        // 长度为5 - 12 位
        if(qq.length() < 5 || qq.length() > 12) {
            flag = false;
        }
        // 开头不能位 0
        if(qq.indexOf('0') == 0) {
            flag = false;
        }
        // 每个字符必须是'0' ~ '9'
        char[] arr = qq.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < '0' || arr[i] > '9') {
                flag = false;
                break;
            }
        }

        return flag;
    }
}
