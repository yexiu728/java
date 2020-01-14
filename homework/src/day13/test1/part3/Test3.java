package day13.test1.part3;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        set.add("苹果");
        set.add("香蕉");
        set.add("西瓜");
        set.add("橘子");

        Random ran = new Random();
        Iterator<String> it = set.iterator();

        while(map.size() < 4) {
            String strNum = "";
            for (int i = 0; i < 8; i++) {
                int num = ran.nextInt(10);
                strNum = strNum + num;
            }
            int num = Integer.parseInt(strNum);
            if(map.containsKey(num)) {
                continue;
            } else {
                map.put(num, it.next());
            }
        }

        System.out.println(map);

        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("请输入要查询商品的号码：");
            int num = scan.nextInt();
            if(map.containsKey(num)) {
                System.out.println("根据商品号：" + num + ", 查询到对应的商品为：" + map.get(num));
            } else {
                System.out.println("查无此商品");
            }
        }

    }
}
