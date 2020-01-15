package day17.part2;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        Properties p = new Properties();
        String key = "lisi";
        String path = "D:\\codeData\\score.txt";

        FileReader fr = null;
        FileOutputStream fos = null;

        try {
            fr = new FileReader(path);


            p.load(fr);
            Set<String> set = p.stringPropertyNames();

            boolean flag = false;
            for (String s : set) {
                if (key.equals(s)) {
                    flag = true;
                    break;
                }
            }

            // 如果存在lisi 的键，则设置其值，并重写写入文件中
            if (flag) {
                p.setProperty(key, "100");
                set = p.stringPropertyNames();
                // 创建时会新建文件并覆盖原文件，所以要写在下面
                fos = new FileOutputStream(path);
                for (String s : set) {
                    fos.write((s + " = " + p.getProperty(s) + "\r\n").getBytes());
                }
                System.out.println("当前文件存在key 值：" + key + " 并已将其修改");

            } else {
                // 如果没有，则提示
                System.out.println("当前文件没有要找的key 值：" + key);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
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

/*
zhangsan=90
lisi=80
wangwu=85
* */
