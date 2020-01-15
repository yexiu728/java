package day17.part2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        File file = new File("D:\\aaa");
        copyFile(file, "D:\\codeData\\a");
    }

    // 拷贝文件夹
    public static void copyFile(File dir, String pathTo) {
        if (!dir.exists()) {
            System.out.println(dir.getAbsolutePath() + " 不存在");
            return;
        }
        if (!new File(pathTo).exists()) {
            System.out.println(pathTo + " 不存在");
            return;
        }

        // 是文件则拷贝
        if (dir.isFile()) {
            try (FileOutputStream fos = new FileOutputStream(pathTo + "\\" + dir.getName());
                 FileInputStream fis = new FileInputStream(dir)
            ) {
                byte[] b = new byte[32];
                int len = 0;
                while ((len = fis.read(b)) != -1) {
                    fos.write(b, 0, len);
                }
                return;

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            // 如果是文件夹则创建文件夹，并递归里面的文件
            File fTo = new File(pathTo + "\\" + dir.getName());
            if (!fTo.exists()) {
                fTo.mkdirs();
            }
            File[] files = dir.listFiles();
            for (File f : files) {
                copyFile(f, fTo.getAbsolutePath());
            }
        }

    }

}
