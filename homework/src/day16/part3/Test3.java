package day16.part3;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要统计的文件夹：");

        File file = new File(scan.nextLine()); // "D:\\software\\Java\\jdk1.8.0_171\\bin"

        Map<String, Integer> map = new HashMap<>();
        mapFile(map, file);

        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            System.out.println(s + " 的类型的文件有 " + map.get(s) + " 个");
        }
    }

    public static void mapFile(Map<String, Integer> map, File file) {
        // 不存在
        if (!file.exists()) {
            System.out.println(file.getAbsolutePath() + " 不存在");
            return;
        }

        // 文件
        if (file.isFile()) {
            String[] name = file.getName().split("\\.");
            String key = name[name.length - 1];
            if (map.containsKey(key)) {
                int value = map.get(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
            return;
        }

        // 文件夹
        File[] files = file.listFiles();
        for (File f : files) {
            mapFile(map, f);
        }
    }
}
