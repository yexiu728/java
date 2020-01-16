package day18;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class Test2 {
    public static void main(String[] args) {
        demo2();
    }

    // 缓冲流、转换流配合使用
    public static void demo2() {

        HashMap<String, String> article = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\codeData\\article.txt"));
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\codeData\\copy.txt"));


            String line = "";
            while ((line = br.readLine()) != null) {
                String[] s = line.split("\\.");
                article.put(s[0], s[1]);
            }

            for (int i = 0; i < article.size(); i++) {

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 转换流拷贝文件
    public static void demo1() {
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\codeData\\Test1.java"), StandardCharsets.UTF_8);
             OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\codeData\\copy.java"), "UTF-8")
        ) {
            char[] c = new char[1024];
            int len = 0;
            while ((len = isr.read(c)) != -1) {
                osw.write(c, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
