package day17.part3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        File file = new File("D:\\codeData\\src");
        String path = "D:\\codeData\\javas";
        copyFile(file, path);
    }

    // 拷贝文件夹
    public static void copyFile(File file, String path) {
        if (!file.exists()) {
            System.out.println(file.getAbsolutePath() + " 不存在");
            return;
        }
        if (!new File(path).exists()) {
            System.out.println("目标目录：" + path + " 不存在");
            return;
        }

        // 如果是文件则直接复制到path 目录
        if (file.isFile()) {
            String outPath = path;
            File out = new File(outPath + "\\" + file.getName());
            // 判断该文件是否已经存在，如果存在，则重新生成文件名
            if (out.exists()) {
                outPath = path + "\\" + System.currentTimeMillis() + out.getName();
                out = new File(outPath);
            }

            // 拷贝文件
            try (FileInputStream fis = new FileInputStream(file);
                 FileOutputStream fos = new FileOutputStream(out);
            ) {

                byte[] b = new byte[32];
                int len = 0;
                while ((len = fis.read(b)) != -1) {
                    fos.write(b, 0, len);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            // 如果是文件夹，则创建对应的文件夹，并提取出里面的java 文件，递归
            File dir = new File(path + "\\" + file.getName());
            if (!dir.exists()) {
                dir.mkdirs();
            }

            File[] javas = file.listFiles(f -> {
                return f.getName().endsWith(".java") || f.isDirectory();
            });
            for (File f : javas) {
                copyFile(f, dir.getAbsolutePath());
            }
        }

    }
}
