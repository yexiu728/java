package day16.part1;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        File file = new File("D:\\bbb");
        if (!file.exists()) {
            boolean b = file.mkdir();
            System.out.println(file.getAbsolutePath() + " 不存在，已创建：" + b);
        } else {
            System.out.println(file.getAbsolutePath() + " 已存在");
        }
    }
}
