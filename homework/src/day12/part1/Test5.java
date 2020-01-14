package day12.part1;

import java.util.HashSet;
import java.util.Iterator;

public class Test5 {
    /*

HashSet基本使用

*/

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("zhangsan");
        set.add("lisi");
        set.add("wangwu");
        set.add("zhangsan");

        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
