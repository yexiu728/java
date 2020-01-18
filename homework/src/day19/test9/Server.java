package day19.test9;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        String file = "D:\\codeData\\a.png";

        while (true) {
            System.out.println("等待连接...");
            try (ServerSocket serverSocket = new ServerSocket(8888);
                 Socket socket = serverSocket.accept();
                 OutputStream os = socket.getOutputStream();
                 BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))
            ) {

                System.out.println("连接成功...");
                byte[] b = new byte[1024];
                int len = 0;
                while ((len = bis.read(b)) != -1) {
                    os.write(b, 0, len);
                }
                System.out.println("传输完成...");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
