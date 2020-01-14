package day16;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File file = new File("study\\src\\day16\\Test1java\\c.txt");

        // 如果文件不存在，则创建之
        if (!file.exists()) {
            boolean success;
            if (file.getName().contains(".")) {
                File parentFile = file.getParentFile();
                success = parentFile.mkdirs();
                success = success && file.createNewFile();
            } else {
                success = file.mkdirs();
            }
            System.out.println((file.isFile() ? "文件" : "文件夹") + "不存在，已创建: " + success);
        }
        // 打开文件
        // Desktop.getDesktop().open(file);

        System.out.println("绝对路径: " + file.getAbsolutePath());
        System.out.println("路径: " + file.getPath());
        System.out.println("文件名称: " + file.getName());
        System.out.println("文件长度: " + file.length());

        System.out.println("是否是文件: " + file.isFile());

        // 如果是文件夹，则遍历
        if (file.isDirectory()) {
            System.out.println("该文件夹下面的文件有: ");
            System.out.println("==========");
            File[] files = file.listFiles();
            for (File f : files) {
                System.out.println((f.isFile() ? "文件: " : "文件夹: ") + f.getName());
            }
            System.out.println("==========");
        }

    }
}
