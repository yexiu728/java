package day19.test7;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 8888);
             OutputStream os = socket.getOutputStream();
             InputStream is = socket.getInputStream();
        ) {

            System.out.println("已连接");

            Scanner scan = new Scanner(System.in);
            System.out.println("请输入要上传的文件：");
            File file = new File(scan.next());

            if (!file.exists()) {
                System.out.println("您输入的文件不存在...");
                return;
            }

            os.write(file.getAbsolutePath().getBytes());

            FileInputStream fis = new FileInputStream(file);
            byte[] b = new byte[1024];
            int len = 0;
            while ((len = fis.read(b)) != -1) {
                os.write(b, 0, len);
            }

            socket.shutdownOutput();
            // bos.write("传输完成".getBytes());

            len = is.read(b);
            System.out.println(new String(b, 0, len));

            System.out.println("上传完毕");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
