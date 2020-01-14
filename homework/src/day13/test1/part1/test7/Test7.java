package day13.test1.part1.test7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test7 {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
        map.put(new Student("刘一", 21), "广东省");
        map.put(new Student("陈二", 21), "广西省");
        map.put(new Student("张三", 21), "湖南省");
        map.put(new Student("李四", 21), "福建省");

        Set<Student> keySet = map.keySet();
        for (Student stu : keySet) {
            System.out.println(stu + ", " + map.get(stu));
        }

        System.out.println("=====");

        Set<Map.Entry<Student, String>> entry = map.entrySet();
        for (Map.Entry<Student, String> en : entry) {
            System.out.println(en.getKey() + ", " + en.getValue());
        }

    }
}
