package day19;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test4 {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8888);
             Socket socket = serverSocket.accept();
             InputStream is = socket.getInputStream();
        ) {

            byte[] b = new byte[64];
            int len = 0;
            while ((len = is.read(b)) != -1) {
                System.out.print(new String(b, 0, len));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
