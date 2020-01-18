package day19.test3;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        OutputStream os = null;
        try {

            serverSocket = new ServerSocket(8888);
            System.out.println("等待连接...");

            socket = serverSocket.accept();

            System.out.println("用户已连接...");

            os = socket.getOutputStream();
            os.write("hello".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) os.close();
                if (socket != null) socket.close();
                if (serverSocket != null) serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
