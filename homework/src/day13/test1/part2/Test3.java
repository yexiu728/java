package day13.test1.part2;

import java.util.HashMap;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");

        Set<Integer> keySet = map.keySet();
        for (Integer i : keySet) {
            System.out.println(i + ", " + map.get(i));
        }

        System.out.println("=====");

        map.put(5, "李晓红");
        map.remove(1);
        map.put(2, "周林");

        System.out.println(map);

    }
}
