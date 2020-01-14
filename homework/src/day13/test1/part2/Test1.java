package day13.test1.part2;

import java.util.HashMap;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        Scanner scan = new Scanner(System.in);

        while(map.size() < 5) {
            System.out.print("请输入学生姓名和年龄(格式 姓名-年龄)：");
            String str = scan.nextLine();
            String[] arr = str.split("-");
            if(arr.length != 2) {
                System.out.println("格式不对");
                continue;
            }

            map.put(arr[0], Integer.parseInt(arr[1]));
        }

        System.out.println("结果：" + map);

    }
}
