package day19.test6;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8888);
             Socket socket = serverSocket.accept();
             InputStream is = socket.getInputStream();
             OutputStream os = socket.getOutputStream()
        ) {

            Scanner scan = new Scanner(System.in);

            while (true) {

                // 发送消息
                String msg = scan.nextLine().trim();
                os.write(msg.getBytes());
                if ("exit".equals(msg)) {
                    System.out.println("聊天结束");
                    break;
                }

                // 接收消息
                byte[] b = new byte[64];
                int len = is.read(b);
                msg = new String(b, 0, len);
                if ("exit".equals(msg)) {
                    System.out.println("聊天结束");
                    break;
                }
                System.out.println("对方：" + msg);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
