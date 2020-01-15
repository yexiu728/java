package day17.part2;

import java.io.FileInputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        char c = 'a';
        int count = countChar("D:\\codeData\\test.txt", c);
        System.out.println(c + " 出现的次数为：" + count + " 次");
    }

    public static int countChar(String path, char c) {
        int count = 0;

        try (FileInputStream fis = new FileInputStream(path)) {
            int b = 0;
            while ((b = fis.read()) != -1) {
                if (c == (char) b) {
                    count++;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

}
