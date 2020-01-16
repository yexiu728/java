package day18;

public class Test0 {
    /*

Test1：缓冲流
    字节缓冲流
         BufferedInputStream
            public BufferedInputStream(InputStream in)
                创建一个 新的缓冲输入流。
         BufferedOutputStream
            public BufferedOutputStream(OutputStream out)
                创建一个新的缓冲输出流。

    字符缓冲流
        BufferedReader
            public BufferedReader(Reader in)
                创建一个新的缓冲输入流。
            public String readLine()
                读一行文字。
        BufferedWriter
            public BufferedWriter(Writer out)
                创建一个新的缓冲输出流。
            public void newLine()
                写一行行分隔符,由系统属性定义符号。

Test2：转换流
    InputStreamReader
        InputStreamReader(InputStream in)
            创建一个使用默认字符集的字符流。
        InputStreamReader(InputStream in, String charsetName)
            创建一个指定字符集的字符流。
    OutputStreamWriter
        OutputStreamWriter(OutputStream in)
            创建一个使用默认字符集的字符流。
        OutputStreamWriter(OutputStream in, String charsetName)
            创建一个指定字符集的字符流。

Test3：序列化流(Serializable)
    ObjectOutputStream
        public ObjectOutputStream(OutputStream out)
            创建一个指定OutputStream的ObjectOutputStream。
        public final void writeObject (Object obj)
            将指定的对象写出。
    ObjectInputStream
        public ObjectInputStream(InputStream in)
            创建一个指定InputStream的ObjectInputStream。
        public final Object readObject()
            读取一个对象。

Test4：打印流
    PrintStream
        public PrintStream(String fileName)
            使用指定的文件名创建一个新的打印流。
            System.setOut(new PrintStream("demo.txt"));
            System.out.println("test");


IO流总结：
    字节输入流(FileInputStream)、字节输出流(FileOutputStream)      参数：File 或 String
    字符输入流(FileReader)、字符输出流(FileWriter)                           参数：File 或 String

    字节缓冲输入流(BufferedInputStream)、字节缓冲输出流(BufferedOutputStream)      参数：字节流
    字符缓冲输入流(BufferedReader)、字符缓冲输出流(BufferedWriter)                           参数：字符流

    转换输入流(InputStreamReader)、转换输出流(OutputStreamWriter)                          参数：字节流

    序列化输入流(ObjectInputStream)、序列化输出流(ObjectOutputStream)                    参数：字节流

    打印流(PrintStream)    参数：String


    读取方法：
        public abstract int read()
        public int read(byte[] b)           // 字节流
        public int read(char[] cbuf)      // 字符流
    写出方法：
        public abstract void write(int b)
        public void write(byte[] b, int off, int len)           // 字节流
        abstract void write(char[] cbuf, int off, int len)   // 字符流
        void write(String str, int off, int len)                   // 字符流

    写出时，先flush 再close
    转换流参数为字节流，方法使用字符流方法
    字符缓冲流特殊方法
        BufferedReader：public String readLine()
        BufferedWriter：public void newLine()
    序列化流方法
        ObjectInputStream：public final Object readObject()
        ObjectOutputStream：public final void writeObject (Object obj)

*/
}
