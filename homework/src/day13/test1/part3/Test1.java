package day13.test1.part3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        HashMap<String, HashMap<String, String>> xiaoMi = new HashMap<>();
        HashMap<String, String> jiChu = new HashMap<>();
        HashMap<String, String> jiuYe = new HashMap<>();

        jiChu.put("001", "李晨");
        jiChu.put("002", "范冰冰");

        jiuYe.put("001", "马云");
        jiuYe.put("002", "马化腾");

        xiaoMi.put("java基础班", jiChu);
        xiaoMi.put("java就业班", jiuYe);

        Set<String> keySet = xiaoMi.keySet();
        for (String clazz : keySet) {
            HashMap<String, String> map = xiaoMi.get(clazz);
            Set<String> key = map.keySet();
            for (String k : key) {
                System.out.println(clazz + " " + k + "号 " + map.get(k));
            }
        }

        System.out.println("==========");

        Set<Map.Entry<String, HashMap<String, String>>> entries = xiaoMi.entrySet();
        Iterator<Map.Entry<String, HashMap<String, String>>> its = entries.iterator();

        while(its.hasNext()) {
            Map.Entry<String, HashMap<String, String>> entrys = its.next();
            String clazz = entrys.getKey();

            HashMap<String, String> map = entrys.getValue();
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while(it.hasNext()) {
                Map.Entry<String, String> entry = it.next();
                System.out.println(clazz + " " + entry.getKey() + "号 " + entry.getValue());
            }
        }

    }
}
