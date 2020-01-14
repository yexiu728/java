package day13.test1.part1;

import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(31, "刘一");
        map.put(23, "张三");
        map.put(24, "李四");
        map.put(35, "王五");
        System.out.println("原map集合：" + map);

        map.put(31, "郑十");
        System.out.println("修改之后的集合：" + map);

        System.out.println("23岁的人是：" + map.get(23));

        map.remove(23);
        System.out.println("删除之后的集合：" + map);

        System.out.println("=====");
        
        map.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        });

    }
}
