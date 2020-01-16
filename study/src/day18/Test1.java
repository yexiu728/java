package day18;

import java.io.*;

public class Test1 {
    public static final String PATH_IN = "D:\\codeData\\Test1.java";
    public static final String PATH_OUT = "D:\\codeData\\copy.java";
    public static final int LENGTH = 32;

    public static void main(String[] args) {
        // byteCopyStream(); // 未执行完成  8564
        // buffCopyStream(); // 1560               164
        buffCopy();

    }

    // 使用字符缓冲流拷贝文件
    public static void buffCopy() {
        try (BufferedReader br = new BufferedReader(new FileReader(PATH_IN));
            BufferedWriter bw = new BufferedWriter(new FileWriter(PATH_OUT))
        ) {

            String line = "";
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

        } catch (IOException e) {

        }
    }

    // 使用字节缓冲流拷贝文件
    public static void buffCopyStream() {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(PATH_IN));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(PATH_OUT));
        ) {

            long start = System.currentTimeMillis();

            /*int data = 0;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }*/
            int len = 0;
            byte[] b = new byte[LENGTH];
            while ((len = bis.read(b)) != -1) {
                bos.write(b, 0, len);
            }

            long end = System.currentTimeMillis();
            System.out.println("buffCopyStream 用时：" + (end - start));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 使用字节流拷贝文件
    public static void byteCopyStream() {
        try (FileInputStream fis = new FileInputStream(PATH_IN);
            FileOutputStream fos = new FileOutputStream(PATH_OUT);
        ) {

            long start = System.currentTimeMillis();

            /*int data = 0;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }*/
            int len = 0;
            byte[] b = new byte[LENGTH];
            while ((len = fis.read(b)) != -1) {
                fos.write(b, 0, len);
            }

            long end = System.currentTimeMillis();
            System.out.println("byteCopyStream 用时：" + (end - start));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
