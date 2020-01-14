package day13.test1.part2;

import java.util.ArrayList;
import java.util.HashMap;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bcd");

        HashMap<Character, Integer> map = new HashMap<>();

        for (String str : list) {
            char[] chars = str.toCharArray();
            for (char c : chars) {
                if(map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }

        System.out.println(map);

    }
}
