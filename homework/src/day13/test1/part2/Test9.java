package day13.test1.part2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test9 {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();

        Scanner scan = new Scanner(System.in);

        while(map.size() < 5) {
            System.out.println("请录入书籍(格式 书名=价格)：");
            String text = scan.nextLine();

            String[] book = text.split("=");
            if(book.length != 2) {
                System.out.println("格式不正确");
                continue;
            }

            map.put(book[0], Double.parseDouble(book[1]));
        }

        System.out.println("原始数据：" + map);

        map.remove("C++");
        map.put("Java", 38.5);

        Set<String> keySet = map.keySet();
        for (String str : keySet) {
            System.out.println(str + ": " + map.get(str));
        }

        System.out.println("==========");

        Set<Map.Entry<String, Double>> entry = map.entrySet();
        for (Map.Entry<String, Double> e : entry) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

    }
}
