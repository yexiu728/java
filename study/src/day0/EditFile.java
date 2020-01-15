package day0;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public class EditFile {
    public static void main(String[] args) {
        /*createFile(new File("D:\\aaa\\a1.txt"));
        createFile(new File("D:\\aaa\\a2.txt"));
        createFile(new File("D:\\aaa\\a3.txt"));
        createFile(new File("D:\\aaa\\a4.txt"));
        createFile(new File("D:\\aaa\\bbb\\b1.txt"));
        createFile(new File("D:\\aaa\\bbb\\b2.txt"));
        createFile(new File("D:\\aaa\\bbb\\b3.txt"));
        createFile(new File("D:\\aaa\\bbb\\b4.txt"));
        createFile(new File("D:\\aaa\\bbb\\ccc\\c1.txt"));
        createFile(new File("D:\\aaa\\bbb\\ccc\\c2.txt"));*/

        File file = new File("D:\\codeData\\src\\day0\\Test1.java");
        String path = "D:\\codeData\\javas\\a";
        copyFile(file, path);

    }

    // 1、创建文件
    public static void createFile(File file) {
        if (file.exists()) {
            System.out.println(file.getAbsolutePath() + " 已经存在");
            return;
        }
        boolean b = true;
        String name = file.getName();
        // 是文件
        if (name.contains(".")) {
            File parent = file.getParentFile();
            parent.mkdirs();
            try {
                b = b && file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            // 文件夹
            file.mkdirs();
        }
        System.out.println("创建 " + file.getAbsolutePath() + (b ? " 成功" : " 失败"));
    }

    // 2、删除文件夹
    public static void deleteFile(File file) {
        if (!file.exists()) {
            System.out.println(file.getAbsolutePath() + " 不存在");
            return;
        }
        if (file.isFile()) {
            boolean b = file.delete();
            System.out.println("删除 " + file.getAbsolutePath() + (b ? " 成功" : " 失败"));
        } else {
            File[] files = file.listFiles();
            for (File f : files) {
                deleteFile(f);
            }
            boolean b = file.delete();
            System.out.println("删除 " + file.getAbsolutePath() + (b ? " 成功" : " 失败"));
        }
    }

    // 3、计算文件夹或文件总大小
    public static long calculate(File file) {
        // 不存在
        if (!file.exists()) {
            System.out.println(file.getAbsolutePath() + " 不存在");
            return 0;
        }
        long size = 0;
        // 文件
        if (file.isFile()) {
            return file.length();
        }
        // 文件夹
        File[] files = file.listFiles();
        for (File f : files) {
            size += calculate(f);
        }
        return size;
    }

    // 4、统计同类型文件个数
    public static void mapFile(Map<String, Integer> map, File file) {
        // 不存在
        if (!file.exists()) {
            System.out.println(file.getAbsolutePath() + " 不存在");
            return;
        }

        // 文件
        if (file.isFile()) {
            String[] name = file.getName().split("\\.");
            String key = name[name.length - 1];
            if (map.containsKey(key)) {
                int value = map.get(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
            return;
        }

        // 文件夹
        File[] files = file.listFiles();
        for (File f : files) {
            mapFile(map, f);
        }
    }

    // 5、拷贝文件夹到目标路径（不考虑文件重复）
    public static void copyFile(File file, String pathTo) {
        if (!file.exists()) {
            System.out.println(file.getAbsolutePath() + " 不存在");
            return;
        }
        // 当传入的dir 为文件且目标目录pathTo不存在时，会出错，因此不能少
        File fileTo = new File(pathTo);
        if (!fileTo.exists()) {
            fileTo.mkdirs();
        }

        // 是文件则拷贝
        if (file.isFile()) {
            try (FileOutputStream fos = new FileOutputStream(pathTo + "\\" + file.getName());
                 FileInputStream fis = new FileInputStream(file)
            ) {
                byte[] b = new byte[1024];
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
            File newTo = new File(fileTo.getAbsolutePath() + "\\" + file.getName());
            if (!newTo.exists()) {
                newTo.mkdirs();
            }
            File[] files = file.listFiles();
            for (File f : files) {
                copyFile(f, newTo.getAbsolutePath());
            }
        }

    }


}
