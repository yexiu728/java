package day16.part2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {

        /*createFile(new File("D:\\aaa\\a.txt"));
        createFile(new File("D:\\aaa\\b.txt"));
        createFile(new File("D:\\aaa\\c.txt"));
        createFile(new File("D:\\aaa\\d.txt"));
        createFile(new File("D:\\aaa\\bbb\\a.txt"));
        createFile(new File("D:\\aaa\\bbb\\b.txt"));
        createFile(new File("D:\\aaa\\bbb\\c.txt"));
        createFile(new File("D:\\aaa\\bbb\\d.txt"));
        createFile(new File("D:\\aaa\\bbb\\ccc\\a.txt"));
        createFile(new File("D:\\aaa\\bbb\\ccc\\b.txt"));*/

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要删除的文件夹：");
        File file = new File(scan.nextLine());
        deleteFile(file);

    }

    // 删除文件夹
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
