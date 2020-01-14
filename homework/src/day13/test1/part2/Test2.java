package day13.test1.part2;

import java.util.HashMap;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("柳岩", 2100);
        map.put("张亮", 1700);
        map.put("诸葛亮", 1800);
        map.put("灭绝师太", 2600);
        map.put("东方不败", 3800);

        int salary  = map.get("柳岩");
        salary += 300;
        map.put("柳岩", salary);

        Set<String> keySet = map.keySet();
        for (String str :  keySet) {
            System.out.println(str + ", " + map.get(str));
        }

    }
}
