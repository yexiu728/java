package day13.test1.part1;

import java.util.HashMap;
import java.util.Iterator;

public class Test4 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("刘德华", "柳岩");
        map.put("黄晓明", "Baby");
        map.put("谢霆锋", "张柏芝");

        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext()) {
            String key = it.next();
            System.out.println(key + "->" + map.get(key));
        }

    }
}
