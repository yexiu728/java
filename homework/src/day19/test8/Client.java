package day19.test8;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 8888);
             OutputStream os = socket.getOutputStream()
        ) {

            Scanner scan = new Scanner(System.in);
            System.out.println("请输入用户名和密码(格式：用户名=密码)");
            String data = scan.nextLine();

            os.write(data.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
