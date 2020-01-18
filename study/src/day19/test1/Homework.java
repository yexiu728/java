package day19.test1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Homework {
    public static class Server{
        public static InputStream inputStream ;
        public static OutputStream outputStream;
        public static Socket socket;

        public static void main(String[] args) throws Exception{
            ServerSocket serverSocket = new ServerSocket(6666);
            System.out.println("等待连接...");
            socket = serverSocket.accept();
            System.out.println("连接成功");
            receive();
            send();
        }

        public static void receive(){
            new Thread(){
                @Override
                public void run() {
                    try {
                        inputStream = socket.getInputStream();
                        byte[] bytes = new byte[1024];
                        int b;
                        while ((b=inputStream.read(bytes))!=-1){
                            String string = new String(bytes,0,b);
                            if(string==null)
                                break;
                            System.out.println("客户端："+string);
                        }
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }

        public static void send(){
            new Thread(){
                @Override
                public void run() {
                    Scanner scanner = new Scanner(System.in);
                    String string;
                    try {
                        outputStream = socket.getOutputStream();
                        while (!(string = scanner.nextLine()).equals("end")){
                                outputStream.write(string.getBytes());
                        }
                        outputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }

    public static class Client{
        public static InputStream inputStream ;
        public static OutputStream outputStream;
        public static Socket socket;

        public static void main(String[] args) throws Exception{
            socket= new Socket("127.0.0.1",6666);

            receive();
            send();
        }

        public static void receive(){
            new Thread(){
                @Override
                public void run() {
                    try {
                        inputStream = socket.getInputStream();
                        byte[] bytes = new byte[1024];
                        int b;
                        while ((b=inputStream.read(bytes))!=-1){
                            String string = new String(bytes,0,b);
                            if(string==null)
                                break;
                            System.out.println("服务器端："+string);
                        }
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }

        public static void send(){
            new Thread(){
                @Override
                public void run() {
                    Scanner scanner = new Scanner(System.in);
                    String string;
                    try {
                        outputStream = socket.getOutputStream();
                        while (!(string = scanner.nextLine()).equals("end")){
                            outputStream.write(string.getBytes());
                        }
                        socket.shutdownOutput();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
