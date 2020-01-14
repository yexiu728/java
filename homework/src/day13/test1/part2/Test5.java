package day13.test1.part2;

import java.util.HashMap;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {

        System.out.println("请输入一行文本：");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        HashMap<String, Integer> map = new HashMap<>();
        char[] chars = text.toCharArray();

        for (char c : chars) {
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                countingKey(map, "字母");
            } else if(c == ' ') {
                countingKey(map, "空格");
            } else if(c >= '0' && c <= '9') {
                countingKey(map, "数字");
            } else {
                countingKey(map, "其他");
            }
        }

        map.keySet().stream().forEach(key -> {
            System.out.println(key + ": " + map.get(key));
        });

    }

    public static void countingKey(HashMap<String, Integer> map, String key) {
        Integer i = map.get(key);
        if(i == null) {
            map.put(key, 1);
        } else {
            map.put(key, i + 1);
        }
    }
}
