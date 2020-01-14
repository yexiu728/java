package day12.part1;

import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args) {

        ArrayList<String> list = add("张三", "李四", "王五", "赵六");
        for (String str : list) {
            System.out.println(str);
        }

    }

    public static ArrayList<String> add(String... str) {
        ArrayList<String> list = new ArrayList<>();

        for (String s : str) {
            list.add(s);
        }

        return list;
    }
}
