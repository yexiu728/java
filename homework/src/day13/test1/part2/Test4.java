package day13.test1.part2;

import java.util.HashMap;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一行内容：");
        String text = scan.nextLine();

        char[] chars = text.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : chars) {
            if(map.containsKey(c)) {
                int num = map.get(c);
                map.put(c, ++num);
            } else {
                map.put(c, 1);
            }
        }

        map.keySet().stream().forEach(key -> {
            System.out.println(key + ": " + map.get(key));
        });

    }
}
