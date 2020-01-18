package day19.test6;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        try (Socket socket = new Socket("127.0.0.1", 8888);
             InputStream is = socket.getInputStream();
             OutputStream os = socket.getOutputStream();
        ) {

            Scanner scan = new Scanner(System.in);

            while (true) {
                // 接收消息
                byte[] b = new byte[64];
                int len = is.read(b);
                String msg = new String(b, 0, len);
                if ("exit".equals(msg)) {
                    System.out.println("聊天结束");
                    break;
                }
                System.out.println("对方：" + msg);

                // 发送消息
                msg = scan.nextLine().trim();
                os.write(msg.getBytes());

                if ("exit".equals(msg)) {
                    System.out.println("聊天结束");
                    break;
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
