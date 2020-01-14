package day13.test1.part2;

import java.util.HashMap;

public class Test10 {
    public static void main(String[] args) {
        String[] province = {"黑龙江省", "浙江省", "江西省", "广东省", "福建省"};
        String[] city = {"哈尔滨", "杭州", "南昌", "广州", "福州"};

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < province.length; i++) {
            map.put(province[i], city[i]);
        }

        System.out.println(map);

    }
}
