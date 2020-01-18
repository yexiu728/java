package day19.test3;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8888);
             InputStream is = socket.getInputStream();
        ) {

            byte[] b = new byte[64];
            int len = 0;
            while ((len = is.read(b)) != -1) {
                System.out.println(new String(b, 0, len));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
