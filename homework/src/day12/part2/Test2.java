package day12.part2;

import java.util.HashSet;

public class Test2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("二丫");
        set.add("钱六");
        set.add("孙七");

        set.remove("二丫");
        set.add("王二丫");

        System.out.println(set);

    }
}
