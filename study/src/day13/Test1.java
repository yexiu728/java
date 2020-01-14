package day13;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("刘一", 21);
        map.put("陈二", 22);
        map.put("张三", 23);
        map.put("李四", 24);
        map.put("王五", 25);

        Set<String> keySet = map.keySet();

        // 遍历方式一：增强for
        /*for (String str : keySet) {
            System.out.println(str + ", " + map.get(str));
        }*/

        // 遍历方式二：迭代器
        /*Iterator<String> it = keySet.iterator();
        while(it.hasNext()) {
            String key = it.next();
            System.out.println(key + ", " + map.get(key));
        }*/

        // 遍历方式三：stream流与lambda表达式
        /*keySet.stream().forEach(key -> {
            System.out.println(key + ", " + map.get(key));
        });*/

        // Map.Entry方式
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        entrySet.stream().forEach(entry -> {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        });

        // 直接输出方式
        System.out.println(map);
        System.out.println(1/0);

    }
}
