package day19.test8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.Set;

public class Server {

    public static void main(String[] args) {

        Properties p = new Properties();

        try {
            p.load(new FileInputStream("homework\\src\\day19\\test8\\pwd.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Set<String> msg = p.stringPropertyNames();

        try (ServerSocket serverSocket = new ServerSocket(8888);
             Socket socket = serverSocket.accept();
             InputStream is = socket.getInputStream();
        ) {

            byte[] b = new byte[1024];
            int len = is.read(b);
            String[] data = new String(b, 0, len).split("=");

            String name = data[0];
            String pwd = data[1];

            boolean flag = false;
            for (String s : msg) {
                if (name.equals(s) && pwd.equals(p.getProperty(s))) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("登录成功");
            } else {
                System.out.println("登录失败");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void demo() {}
}
