package day13.test1.part2;

import java.util.HashMap;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {

        // If you want to change your fate I think you must come to the dark horse to learn java
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一行英文：");
        String text = scan.nextLine();

        String[] words = text.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for (String w : words) {
            if(map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } else {
                map.put(w, 1);
            }
        }

        map.keySet().stream().forEach(key -> {
            System.out.println(key + "=" + map.get(key));
        });

    }
}
