package day12.part2;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = scan.nextLine();

        char[] arr = str.toCharArray();

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char c : arr) {
            set.add(c);
        }

        for (Character c : set) {
            System.out.print(c);
        }

    }
}
