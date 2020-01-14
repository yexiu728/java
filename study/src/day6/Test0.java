package day6;

public class Test0 {
/*
1.5h

Test1
    String：字符串
        创建字符串：
            ""
                直接使用双引号创建字符串对象
                String str1 = "hallo";
            String()
                创建一个空的字符串对象
                String str2 = new String();
            String(String original)
                根据字符串来创建一个字符串对象
                String str3 = new String("hello");
            String(char[] value)
                通过字符数组来创建字符串对象
                String str4 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
            String(byte[] bytes)
                通过字节数组来构造新的字符串对象
                String str5 = new String(new byte[]{1, 2, 3, 4});
                    输出str5 会乱码
            String(byte[] bytes, int offset, int length)
                通过字节数组一部分来构造新的字符串对象
                String str6 = new String(str4.getBytes(), 2, 2);
                    如果直接用byte[] 数组，输出会乱码

    String特点
        1. 字符串不变：字符串的值在创建后不能被更改。
        2. 因为String对象是不可变的，所以它们可以被共享。
            String s1="abc";
            String s2="abc";
            //内存中只有一个"abc"对象被创建，同时被s1和s2共享

    判断功能的方法
        public boolean equals (Object anObject)
            将此字符串与指定对象进行比较。
        public boolean equalsIgnoreCase (String anotherString)
            将此字符串与指定对象进行比较，忽略大小写。

    获取功能的方法
        public int length ()
            返回此字符串的长度。
        public String concat (String str)
            将指定的字符串连接到该字符串的末尾。
        public char charAt (int index)
            返回指定索引处的 char值。
        public int indexOf (String str)
            返回指定子字符串第一次出现在该字符串内的索引。
        public String substring (int beginIndex)
            返回一个子字符串，从beginIndex开始截取字符串到字符 串结尾。
        public String substring (int beginIndex, int endIndex)
            返回一个子字符串，从beginIndex到 endIndex截取字符串。含beginIndex，不含endIndex。

    转换功能的方法
        public char[] toCharArray ()
            将此字符串转换为新的字符数组。
        public byte[] getBytes ()
            使用平台的默认字符集将该 String编码转换为新的字节数组。
        public String toLowerCase()
            使用默认语言环境的规则将此 String所有字符转换为小写。
        public String toUpperCase()
            将此 String所有字符转换为大写，使用默认语言环境的规则。
        public String replace (CharSequence target, CharSequence replacement)
            将与target匹配的字符串使 用replacement字符串替换。

    分割功能的方法
        public String[] split(String regex)
            将此字符串按照给定的regex（规则）拆分为字符串数组。

Test2
    常量池
        常量池也是JVM中的一块内存区域。
        在JDK1.6及以前，常量池是存储在方法区的，在JDK1.7之和，常量池被划分到 了堆内存。
        常量池的东西只会保存一份
    通过如下代码创建的String字符串都是存储在常量池的：
        String s1="abc";
        String s2="abc";
        System.out.println(s1==s2); //返回true

    static关键字
        可以用来修饰的成员变量和成员方法，
        被修饰的成员是属于类的，而不是单单是属 于某个对象的。
        也就是说，既然属于类，就可以不靠创建对象来调用了。
    类变量：使用 static关键字修饰的成员变量。
        static 数据类型 变量名；
        static int numberID；
    类方法：使用 static关键字修饰的成员方法，习惯称为静态方法。
        修饰符 static 返回值类型 方法名 (参数列表) {
            // 执行语句
        }
        public static void showNum() {
            System.out.println("num:" + numberOfStudent);
        }
    静态方法调用的注意事项：
        静态方法可以直接访问类变量和静态方法。
        静态方法不能直接访问普通成员变量或成员方法。
        反之，成员方法可以直接访问类变量或静态方法。
        静态方法中，不能使用this关键字。

        被static修饰的成员可以并且建议通过类名直接访问
    静态代码块
        定义在成员位置，使用static修饰的代码块{ }。
        位置：类中方法外。
        执行：随着类的加载执行，而执行且执行一次。

Test4
    Arrays类
        java.util.Arrays
            此类包含用来操作数组的各种方法，比如排序和搜索等。其所有方法均为静态方法
        public static String toString(int[] a)
            返回指定数组内容的字符串表示形式。
        public static void sort(int[] a)
            对指定的 int 型数组按数字升序进行排序。

Test4
    Math类
        java.lang.Math
            此类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。
            类似这样的工具类，其所有方法均为静态方法，并且不需要创建对象，调用起来非常简单。
        public static double abs(double a)
            返回 a 值的绝对值
        public static double ceil(double a)
            返回大于等于参数的最小的整数。（向上取整）
        public static double floor(double a)
            返回小于等于参数最大的整数。（向下取整）
        public static long round(double a)
            返回最接近参数的 long。(相当于四舍五入方法)

*/
}
