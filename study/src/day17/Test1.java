package day17;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        /*try {
            demo1();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // demo2();

        // demo3();

        demo4();

    }

    // 复制粘贴文件
    public static void demo4() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:\\codeData\\apache-tomcat.zip");
            fos = new FileOutputStream("D:\\codeData\\copy.zip");

            byte[] b = new byte[1024 * 10];
            int len = 0;
            while ((len = fis.read(b)) != -1) {
                fos.write(b, 0, len);
            }

            System.out.println("复制完成");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (fos != null) {
                    fos.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void demo3() {
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(new File("D:\\a.txt"), true);
            byte[] bytes = "你好".getBytes();
            fos.write(bytes, 0, bytes.length);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void demo2() {
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("D:\\a.txt", true);
            fos.write(new byte[]{48, 49, 50});
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void demo1() throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\a.txt");
        fos.write(97);
        fos.write("\r\n".getBytes()); // 回车换行
        fos.write(98);
        fos.write("\r\n".getBytes());
        fos.write(99);
        fos.close();
    }

}
