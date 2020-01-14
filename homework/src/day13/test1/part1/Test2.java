package day13.test1.part1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(21, "刘一");
        map.put(33, "张三");
        map.put(34, "李四");
        map.put(25, "王五");

        Set<Integer> keySet = map.keySet();

        Iterator<Integer> it = keySet.iterator();
        while(it.hasNext()) {
            Integer key = it.next();
            System.out.println("key: " + key + ", value: " + map.get(key));
        }

    }
}
