package day13.test1.part1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test5 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("邓超", "孙 俪");
        map.put("李晨", "范冰冰");
        map.put("刘德华", "柳岩");
        map.put("黄晓明", "Baby");
        map.put("谢霆锋", "张柏芝");

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

    }
}
