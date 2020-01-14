package day16.part1;

import java.io.File;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) throws IOException {
        File fileD = new File("D:\\aaa");
        File file = new File(fileD, "b.txt");

        if (!fileD.exists()) {
            boolean b = fileD.mkdir();
            if (!file.exists()) {
                b = b && file.createNewFile();
            }
            System.out.println(file.getAbsolutePath() + " 不存在，创建：" + b);
        }

        System.out.println("文件名：" + file.getName());
        System.out.println("文件大小：" + file.length());
        System.out.println("绝对路径：" + file.getAbsolutePath());
        System.out.println("父路径：" + file.getParent());
    }
}
