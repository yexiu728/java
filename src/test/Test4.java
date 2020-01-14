package test;

import java.io.File;
import java.io.FileFilter;

// 递归获得目录下的所有文件
public class Test4 {
    public static void main(String[] args) {
        new Test4();
    }

    public Test4() {
        getFile(new File("D:\\"));
    }

    public void getFile(File file) {

        if(!file.exists()) {
            return;
        }

        try {
            if (file.isFile()) {
                System.out.println("file: " + file.getAbsolutePath());
            } else {
                System.out.println("dir: " + file.getAbsolutePath());

                File[] fs = file.listFiles(new FileFilter() {
                    @Override
                    public boolean accept(File pathname) {
                        return pathname.getName().endsWith(".jpg") || pathname.isDirectory();
                    }
                });

                for (File f : fs) {
                    getFile(f);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
