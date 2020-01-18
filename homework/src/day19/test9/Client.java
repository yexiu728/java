package day19.test9;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String path ="D:\\codeData\\b.png";
        try (Socket socket = new Socket("127.0.0.1", 8888);
             InputStream is = socket.getInputStream();
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path))
        ) {

            System.out.println("已建立连接...");

            byte[] b = new byte[1024];
            int len = 0;
            while ((len = is.read(b)) != -1) {
                bos.write(b, 0, len);
            }

            System.out.println("连接任务已完成...");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
