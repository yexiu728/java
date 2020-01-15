package day17;

public class Test0 {
    /*

Test1：字节流（使用字节byte）
        字节输出流【OutputStream】
            FileOutputStream 类是文件输出流，用于将数据写出到文件。

            public void close()
                关闭此输出流并释放与此流相关联的任何系统资源。
                当完成流的操作时，必须调用此方法，释放系统资源。
            public void flush()
                刷新此输出流并强制任何缓冲的输出字节被写出。
            public void write(byte[] b)
                将 b.length字节从指定的字节数组写入此输出流。
                系统中的换行：
                    Windows系统里，每行结尾是 回车+换行 ，即 \r\n；
                    Unix系统里，每行结尾只有 换行 ，即 \n ；
                    Mac系统里，每行结尾是 回车 ，即 \r 。
                    从 Mac OS X开始与Linux统一。
            public void write(byte[] b, int off, int len)
                从指定的字节数组写入 len字节，从偏移量 off开始输 出到此输出流。
            public abstract void write(int b)
                将指定的字节输出流。

        字节输入流【InputStream】
            FileInputStream 类是文件输入流，从文件中读取字节。

            public void close()
                关闭此输入流并释放与此流相关联的任何系统资源。
            public abstract int read()
                从输入流读取数据的下一个字节。
            public int read(byte[] b)
                从输入流中读取一些字节数，并将它们存储到字节数组 b中 。

Test2：字符流（使用字符char）
    字符输入流【Reader】
        FileReader 类是读取字符文件的便利类。构造时使用系统默认的字符编码和默认字节缓冲区。

        public void close()
            关闭此流并释放与此流相关联的任何系统资源。
        public int read()
            从输入流读取一个字符。
        public int read(char[] cbuf)
            从输入流中读取一些字符，并将它们存储到字符数组 cbuf中 。

     字符输出流【Writer】
        FileWriter 类是写出字符到文件的便利类。构造时使用系统默认的字符编码和默认字节缓冲区。

        void write(int c)
            写入单个字符。
        void write(char[] cbuf)
            写入字符数组。
        abstract void write(char[] cbuf, int off, int len)
            写入字符数组的某一部分,off数组的开始索引,len 写的字符个数。
        void write(String str)
            写入字符串。
        void write(String str, int off, int len)
            写入字符串的某一部分,off字符串的开始索引,len写的字符个 数。
        void flush()
            刷新该流的缓冲。
        void close()
            关闭此流，但要先刷新它。

Test3：属性集
    Properties
        继承于 Hashtable ，来表示一个持久的属性集。它使用键值结构存储数据，每个键及其对应值都是一个字符串。
    构造方法
        public Properties()
            创建一个空的属性列表。
    基本的存储方法
        public Object setProperty(String key, String value)
            保存一对属性。
        public String getProperty(String key)
            使用此属性列表中指定的键搜索属性值。
        public Set<String> stringPropertyNames()
            所有键的名称的集合。
    与流相关的方法
        public void load(InputStream inStream)
            从字节输入流中读取键值对。
            文本中的数据，必须是键值对形式，可以使用空格、等号、冒号等符号分隔。

*/
}
