package day13.test1.part3;

import java.util.HashMap;

public class Test2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("及时雨", "宋江");
        map.put("玉麒麟", "卢俊义");
        map.put("智多星", "吴用");

        System.out.println("原集合：" + map);
        map.put("入云龙", "公孙胜");
        map.put("豹子头", "林冲");
        map.remove("玉麒麟");
        map.put("智多星", null);

        map.remove("及时雨");
        map.put("呼保义", "宋江");

        System.out.println(map);

    }
}
