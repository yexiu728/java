package day16.part1;

import java.io.File;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("D:\\a.txt");
        File file2 = new File("D:\\aaa");

        if (!file1.exists()) {
            boolean b = file1.createNewFile();
            System.out.println(file1.getAbsolutePath() + " 不存在，创建：" + b);
        }

        if (!file2.exists()) {
            boolean b = file2.mkdir();
            System.out.println(file2.getAbsolutePath() + " 不存在，创建：" + b);
        }

        boolean b1 = file1.delete();
        System.out.println(file1.getAbsolutePath() + " 删除：" + b1);

        boolean b2 = file2.delete();
        System.out.println(file2.getAbsolutePath() + " 删除：" + b2);

    }
}
