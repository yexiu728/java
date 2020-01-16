package day18;

import java.io.*;

public class Test3 {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\a.png"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\codeData\\c.png"))
        ) {

            byte[] b = new byte[1024];
            int len = 0;
            while ((len = bis.read(b)) != -1) {
                bos.write(b, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
