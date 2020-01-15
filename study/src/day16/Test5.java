package day16;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Test5 {

    public static void main(String[] args) {
        createFile(new File("D:\\aaa\\a1.txt"));
        createFile(new File("D:\\aaa\\a2.txt"));
        createFile(new File("D:\\aaa\\a3.txt"));
        createFile(new File("D:\\aaa\\a4.txt"));
        createFile(new File("D:\\aaa\\bbb\\b1.txt"));
        createFile(new File("D:\\aaa\\bbb\\b2.txt"));
        createFile(new File("D:\\aaa\\bbb\\b3.txt"));
        createFile(new File("D:\\aaa\\bbb\\b4.txt"));
        createFile(new File("D:\\aaa\\bbb\\ccc\\c1.txt"));
        createFile(new File("D:\\aaa\\bbb\\ccc\\c2.txt"));
    }

    // 1、创建文件
    public static void createFile(File file) {
        if (file.exists()) {
            System.out.println(file.getAbsolutePath() + " 已经存在");
            return;
        }
        boolean b = true;
        String name = file.getName();
        // 是文件
        if (name.contains(".")) {
            File parent = file.getParentFile();
            parent.mkdirs();
            try {
                b = b && file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            // 文件夹
            file.mkdirs();
        }
        System.out.println("创建 " + file.getAbsolutePath() + (b ? " 成功" : " 失败"));
    }

    // 2、删除文件夹
    public static void deleteFile(File file) {
        if (!file.exists()) {
            System.out.println(file.getAbsolutePath() + " 不存在");
            return;
        }
        if (file.isFile()) {
            boolean b = file.delete();
            System.out.println("删除 " + file.getAbsolutePath() + (b ? " 成功" : " 失败"));
        } else {
            File[] files = file.listFiles();
            for (File f : files) {
                deleteFile(f);
            }
            boolean b = file.delete();
            System.out.println("删除 " + file.getAbsolutePath() + (b ? " 成功" : " 失败"));
        }
    }

    // 3、计算文件夹或文件总大小
    public static long calculate(File file) {
        // 不存在
        if (!file.exists()) {
            System.out.println(file.getAbsolutePath() + " 不存在");
            return 0;
        }
        long size = 0;
        // 文件
        if (file.isFile()) {
            return file.length();
        }
        // 文件夹
        File[] files = file.listFiles();
        for (File f : files) {
            size += calculate(f);
        }
        return size;
    }

    // 4、统计同类型文件个数
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
