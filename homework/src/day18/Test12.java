package day18;

import java.io.*;

public class Test12 {
    public static void main(String[] args) {
        String pathIn = "D:\\codeData\\music.txt";
        String pathOut = "D:\\codeData\\musicB.txt";

        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(pathIn), "UTF-8");
             OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(pathOut), "UTF-8");
             InputStreamReader isrNew = new InputStreamReader(new FileInputStream(pathOut), "UTF-8")
        ) {

            // 拷贝
            char[] c = new char[32];
            int len = 0;
            while ((len = isr.read(c)) != -1) {
                osw.write(c, 0, len);
                osw.flush();
            }

            // 读取并打印到控制台
            while ((len = isrNew.read(c)) != -1) {
                System.out.print(new String(c, 0, len));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
