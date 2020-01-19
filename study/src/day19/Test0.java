package day19;

public class Test0 {
    /*

Test1：
    C/S结构
        全称为Client/Server结构，是指客户端和服务器结构。常见程序有ＱＱ、迅雷等软件。
    B/S结构
        全称为Browser/Server结构，是指浏览器和服务器结构。常见浏览器有谷歌、火狐等。

    网络通信协议：
        TCP/IP协议
            传输控制协议/因特网互联协议( Transmission Control Protocol/Internet Protocol)，
            是 Internet最基本、最广泛的协议。
        UDP：用户数据报协议(User Datagram Protocol)。UDP是无连接通信协议
        TCP：传输控制协议 (Transmission Control Protocol)。TCP协议是面向连接的通信协议

    网络编程三要素：
        协议：计算机网络通信必须遵守的规则
        IP地址：指互联网协议地址（Internet Protocol Address），俗称IP
        端口号：用两个字节表示的整数，它的取值范围是0~65535

    TCP通信程序
        1. 客户端： java.net.Socket 类表示。
            创建 Socket 对象，向服务端发出连接请求，服务端响应请求，两者建 立连接开始通信。
        2. 服务端： java.net.ServerSocket 类表示。
            创建 ServerSocket 对象，相当于开启一个服务，并等待客户端 的连接。

        Socket 类：
            该类实现客户端套接字，套接字指的是两台设备之间通讯的端点。
            public Socket(String host, int port)
                创建套接字对象并将其连接到指定主机上的指定端口号。如果指 定的host是null ，则相当于指定地址为回送地址。
            public InputStream getInputStream()
                返回此套接字的输入流。
            public OutputStream getOutputStream()
                返回此套接字的输出流。
            public void closeSocket()
                关闭此套接字。
            public void shutdownOutput()
                禁用此套接字的输出流。
        ServerSocket 类：这个类实现了服务器套接字，该对象等待通过网络的请求。
            public ServerSocket(int port)
                使用该构造方法在创建ServerSocket对象时，就可以将其绑定到一个指 定的端口号上，参数port就是端口号。
            public Socket accept()
                侦听并接受连接，返回一个新的Socket对象，用于和客户端实现通信。该方法 会一直阻塞直到建立连接。

*/
}
