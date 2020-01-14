package day16.part1;

import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\a.txt");
        if (!file.exists()) {
            boolean result = file.createNewFile();
            System.out.println(file.getAbsolutePath() + " 不存在，已创建：" + result);
        } else {
            System.out.println(file.getAbsolutePath() + " 已存在");
        }
    }
}
