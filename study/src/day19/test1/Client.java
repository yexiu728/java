package day19.test1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

// 客户端
public class Client {

    static Socket socket = null;
    static InputStream is = null;
    static OutputStream os = null;

    public static void main(String[] args) {
        try {
            socket = new Socket("localhost", 8888);
            is = socket.getInputStream();
            os = socket.getOutputStream();

            System.out.println("已建立连接...");

            // 发送消息
            sendMessage();
            // 接收消息
            receiveMessage();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 关闭套接字
    public static void closeSocket() {
        try {
            // socket.shutdownOutput();
            if (os != null) os.close();
            if (is != null) is.close();
            if (socket != null) socket.close();
            System.out.println("已关闭连接...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 发送消息
    public static void sendMessage() {
        new Thread() {
            @Override
            public void run() {
                Scanner scan = new Scanner(System.in);
                while (true) {
                    try {
                        String text = scan.nextLine();
                        if ("exit".equals(text)) {
                            closeSocket();
                            break;
                        }
                        os.write(text.getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                        closeSocket();
                        System.out.println("发送消息已关闭");
                        break;
                    }
                }
            }
        }.start();
    }

    // 接收消息
    public static void receiveMessage() {
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        byte[] b = new byte[1024 * 2];
                        int len = is.read(b);
                        if (len == -1) {
                            throw new IOException("接收信息错误，此刻应该关闭连接...");
                        }
                        System.out.println("对方：" + new String(b, 0, len));

                    } catch (IOException e) {
                        e.printStackTrace();
                        closeSocket();
                        System.out.println("接收消息已关闭");
                        break;
                    }
                }
            }
        }.start();
    }


}
