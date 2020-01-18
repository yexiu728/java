package day20.test9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test9 {
    public static void main(String[] args) throws Exception {
        String path = "homework\\src\\day20\\test9\\properties.properties";
        File file = new File(path);
        if (!file.exists()) {
            // System.out.println("不存在");
            // return;
            boolean b = file.createNewFile();
            System.out.println("创建文件：" + b);
        }

        Properties pro = new Properties();
        pro.load(new FileInputStream(file));

        if (pro.getProperty("count") == null) {
            pro.setProperty("count", "0");
        }

        int count = Integer.parseInt(pro.getProperty("count"));

        if (count >= 3) {
            System.out.println("程序使用次数已满，请续费");
            return;
        }

        System.out.println("运行次数：" + count++);

        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(("count=" + count).getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
