package day5;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("孙悟空");
        arr.add("猪八戒");
        arr.add("沙和尚");
        arr.add("铁扇公主");

        System.out.println("获取索引为3 的元素：" + arr.get(3));

        arr.set(3, "唐僧");
        arr.remove(1);

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

    }
}
