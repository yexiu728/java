package day13.test1.part1.test6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {

        HashMap<String, Student> map = new HashMap<>();

        map.put("广东省", new Student("刘一", 21));
        map.put("广西省", new Student("陈二", 22));
        map.put("湖南省", new Student("张三", 23));
        map.put("北京市", new Student("李四", 24));

        Set<String> keySet = map.keySet();
        for (String str : keySet) {
            System.out.println(str + ", " + map.get(str));
        }

        System.out.println("=====");

        Set<Map.Entry<String, Student>> entry = map.entrySet();
        for (Map.Entry<String, Student> e : entry) {
            System.out.println(e.getKey() + ", " + e.getValue());
        }

    }
}
