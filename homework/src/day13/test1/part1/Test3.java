package day13.test1.part1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(31, "刘一");
        map.put(32, "张三");
        map.put(24, "李四");
        map.put(35, "王五");

        Set<Integer> keySet = map.keySet();

        for (Integer i : keySet) {
            System.out.println(map.get(i));
        }

        System.out.println("=========");

        Iterator<Integer> it = keySet.iterator();
        while(it.hasNext()) {
            Integer key = it.next();
            System.out.println(map.get(key));
        }
    }
}
