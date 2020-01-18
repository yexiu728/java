package day19.test7;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        String path = "D:\\codeData\\server";

        while (true) {

            System.out.println("正在等待连接...");
            try (ServerSocket serverSocket = new ServerSocket(8888);
                 Socket socket = serverSocket.accept();
                 InputStream is = socket.getInputStream();
                 OutputStream os = socket.getOutputStream()
            ) {

                System.out.println("已连接");

                byte[] b = new byte[1024];
                int len = is.read(b);
                if (len == -1) {
                    continue;
                }
                File file = new File(new String(b, 0, len));

                System.out.println("接收到文件需求：" + file.getAbsolutePath());

                if (!file.exists()) {
                    System.out.println(file.getAbsolutePath() + " 不存在");
                    os.write("上传失败".getBytes());
                    continue;
                }

                System.out.println("正在接收文件...");
                String filePath = path + "\\" + System.currentTimeMillis() + file.getName();
                FileOutputStream fos = new FileOutputStream(filePath);
                while ((len = is.read(b)) != -1) {
                    fos.write(b, 0, len);
                }
                fos.flush();
                fos.close();

                System.out.println("接收成功");
                os.write("服务器：接收成功".getBytes());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
