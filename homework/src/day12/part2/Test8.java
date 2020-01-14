package day12.part2;

import java.util.HashSet;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        while(true) {
            System.out.print("请输入数字：");
            int num = scan.nextInt();

            if(num == -1) {
                break;
            }

            set.add(num);
        }

        int sum = 0;
        for (Integer i : set) {
            sum += i;
        }

        System.out.println("和为：" + sum);
        System.out.println("平均值为：" + (sum / set.size()));

    }
}
