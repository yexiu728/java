package day16.part1;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        File file = new File("D:\\ccc\\bbb\\aaa");
        if (!file.exists()) {
            boolean b = file.mkdirs();
            System.out.println(file.getAbsolutePath() + " 不存在，已创建：" + b);
        } else {
            System.out.println(file.getAbsolutePath() + " 已存在");
        }
    }
}
