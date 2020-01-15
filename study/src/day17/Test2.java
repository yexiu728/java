package day17;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) {
        demo1();
    }

    // 复制粘贴文件
    public static void demo1() {
        FileReader fr = null;
        FileWriter fw = null;


        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String date = sdf.format(new Date());

        try {
            // fr = new FileReader("D:\\codeData\\apache-tomcat.zip"); // 二进制文件不能正常复制
            // fw = new FileWriter("D:\\codeData\\copy.zip"); // 二进制文件无法正常打开

            File file = new File("D:\\codeData\\Test1.java");
            fr = new FileReader(file);
            fw = new FileWriter("D:\\codeData\\" + date + file.getName());

            char[] c = new char[1024 * 10];
            int len = 0;
            while ((len = fr.read(c)) != -1) {
                fw.write(c, 0, len);
                fw.flush();
            }
            System.out.println("复制成功");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
