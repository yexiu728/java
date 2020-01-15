package day16.part3;

import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        createFile(new File("D:\\aaa\\a.txt"));
        createFile(new File("D:\\aaa\\b.txt"));
        createFile(new File("D:\\aaa\\c.txt"));
        createFile(new File("D:\\aaa\\d.txt"));
        createFile(new File("D:\\aaa\\bbb\\a.txt"));
        createFile(new File("D:\\aaa\\bbb\\b.txt"));
        createFile(new File("D:\\aaa\\bbb\\c.txt"));
        createFile(new File("D:\\aaa\\bbb\\d.txt"));
        createFile(new File("D:\\aaa\\bbb\\ccc\\a.txt"));
        createFile(new File("D:\\aaa\\bbb\\ccc\\b.txt"));

        deleteFile(new File("D:\\aaa"));

    }

    public static void deleteFile(File file) {
        if (file.isFile()) {
            System.out.println("删除文件 " + file.getAbsolutePath() + (file.delete() ? " 成功" : " 失败"));
            return;
        }
        File[] files = file.listFiles();
        for (File f : files) {
            deleteFile(f);
        }
        System.out.println("删除文件夹 " + file.getAbsolutePath() + (file.delete() ? " 成功" : " 失败"));
    }

    // 创建文件
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
}
