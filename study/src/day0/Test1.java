package day0;

public class Test1 {

    // 刘一、陈二、张三、李四、王五、赵六、孙七、周八、吴九、郑十

    // 入口函数
    public void day1() {
/*
// 入口函数
public static void main(String[] args) {
    System.out.println("HelloWorld");
}

JDK > JRE > JVM

异常：
    运行时异常：
        空指针 NullPointerException    变量为null，但调用了该类型的方法时会遇到
        数组越界 ArrayIndexOutOfBoundsException    数组中会遇到
        类型转换异常 ClassCaseException    强制类型转换时会遇到
        数字转换异常 NumberFormatException    字符串转换成基本类型时会遇到
        无元素异常 NoSuchElementException    迭代器指针出界后会遇到
        算术异常 ArithmeticException    除法除数为0时遇到
        锁状态异常 IllegalMonitorStateException 线程wait和notify用的锁与synchronized锁不同时会遇到

    编译时期异常：
        解析异常 ParseException    日期解析字符串时会遇到
        线程中断异常 InterruptedException 线程休眠sleep时会遇到

*/
    }

    // 变量、方法
    public void day2() {
/*

8 种数据类型
    byte            short                   int                                     long        float       double      char    boolean
    1                   2                       4                                       8               4           8               2       1           字节
    -128~127    -32768~32767    -2147483648~2147483647

char 类型（ASCII 编码表）
    0：48-57
    A：65-90
    a：97-122

取模%
    System.out.println(7 % 3); // 1
    System.out.println(7 % -3); // 1
    System.out.println(-7 % 3); // -1
    System.out.println(-7 % -3); // -1
    取余结果符号与左边符号相同

标识符：是指在程序中，我们自己定义的名字。比如类的名字、方法的名字和变量的名字等等，都是标识 符。
    命名规则：硬性要求
        标识符可以包含 26个英文字母(区分大小写) 、 0-9数字 、 $（美元符号） 和 _（下划线） 。
        标识符不能以数字开头。
        标识符不能是关键字。
        区分大小写。

命名规范： 软性建议
    类名规范：每个单词首字母大写（大驼峰式）。
    方法名和变量名规范：第一个单词全小写，后面每个单词首字母大写（小驼峰式）。
    包名规范：全部小写。

自动类型转换
    范围小的类型向范围大的类型提升， byte 、 short 、 char 运算时直接提升为 int 。

强制类型转换
    将 取值范围大的类型 强制转换成 取值范围小的类型
    float f = 10.1F; // 小数不加F 会报错
        浮点型默认为double 类型，转成float 类型需要强制转换，加上F 则意味着这个数是float 类型
    long l = 2147483648L; // 不加L 会报错
        因为数值大于int 类型的最大值，如果不加L 则意味着这个数为int 类型，超出范围会报错

方法
    修饰符 返回值类型 方法名 （参数列表）{
        代码...
    }

    定义格式解释：
        修饰符：目前固定写法 public static 。
        返回值类型： 目前固定写法 void ，其他返回值类型在后面的课程讲解。
        方法名：为我们定义的方法起名，满足标识符的规范，用来调用方法。
        参数列表： 目前无参数，带有参数的方法在后面的课程讲解。

获取位数
    int num = 1234;
    g = num % 10;
    s = num / 10 % 10;
    b = num / 100 % 10;
    q = num / 1000 % 10;

switch 语句注意
    switch语句中，表达式的数据类型，可以是byte，short，int，char，enum（枚举），JDK7后可以接收字符串。

case的穿透性
    在switch语句中，如果case的后面不写break，将出现穿透现象，
    也就是不会在判断下一个case的值，直接向后运行，直到遇到break，或者整体switch结束。

*/

    }

    // 方法重载、数组
    public void day3() {
/*

test2：
    continue：结束本次循环，继续下次循环
    break：跳出循环
    return：返回数据，结束方法的执行

test3：
    方法重载
        1、方法名相同
        2、参数列表不同（参数个数不同、参数类型不同）
        3、与返回值类型无关

    数组
        数组存储的数据类型[] 数组名字=new 数组存储的数据类型[长度];
            int[] arr=new int[3];
        数据类型[] 数组名称=new 数据类型[]{元素1,元素2,元素3....};
            int[] arr=new int[]{3,5,6};
        数据类型[] 数组名称={元素1,元素2,元素3};
            int[] arr={1,34,65};

        定长、只能存当前类型

    内存模型
        堆、栈、方法区

*/

    }

    // 类与对象
    public void day4() {
/*

test1：

    字符串有length 属性，没有length() 方法

    数组越界异常
        ArrayIndexOutOfBoundsException
    空指针异常
        NullPointerException

    反转数组
        public static void reverse(int[] arr) {
            for(int start = 0, end = arr.length - 1; start < end; start++, end--) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

    打印数组
        public static void printArr(int[] arr) {
            System.out.print("[ ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if(i <= arr.length - 2) {
                    System.out.print(", ");
                } else {
                    System.out.print(" ]");
                }
            }
            System.out.println();
        }

Test2：
    类与对象
        类：是一组相关属性和行为的集合，是抽象的
        对象：是一类事物的具体体现，是具体的
            类是对象的模板，对象是类的实体

        定义类：就是定义类的成员，包括成员变量和成员方法。
            public class 类名 {
                //成员变量
                //成员方法
            }
            成员变量：和以前定义变量几乎是一样的。
                只不过位置发生了改变。在类中，方法外。
                String name;
            成员方法：和以前定义方法几乎是一样的。
                只不过把static去掉
                public void study(){
                    System.out.println("学习");
                }

        创建对象
            类名 对象名 = new 类名();

    局部变量和成员变量的区别？
        在类中的位置不同
            成员变量：类中，方法外
            局部变量：方法中或者方法声明上(形式参数)
        作用范围不一样
            成员变量：类中
            局部变量：方法中
        初始化值的不同
            成员变量：有默认值
            局部变量：没有默认值。必须先定义，赋值，最后使用
        在内存中的位置不同
            成员变量：堆内存
            局部变量：栈内存
        生命周期不同
            成员变量：随着对象的创建而存在，随着对象的消失而消失
            局部变量：随着方法的调用而存在，随着方 法的调用完毕而消失

Test4：

    private：私有的

    构造器：无返回值，名称和类名相同
    如果定义了带参数的构造器，则必须定义一个无参的构造器

    封装原则
        将属性隐藏起来，若需要访问某个属性，提供公共方法对其访问

    自动生成构造器和getter、setter 方法
        右键 -> Generate
        或者 Alt + Insert

*/

    }

    // Scanner、Random、ArrayList
    public void day5() {

/*

Test1：
    java.util.Scanner
        一个可以解析基本类型和字符串的简单文本扫描器

        Scanner sc=new Scanner(System.in);
            System.in 系统输入指的是通过键盘录入数据
            创建对象时可以将字符串、文件等作为参数

        sc.nextInt(); // 整型数据
            可以读取其他类型，如：sc.nextDouble()

        sc.next(); // 读取字符串

        sc.nextLine(); // 读取字符串
            next()和nextLine()方法的区别
                next()方法在读取内容时，会过滤掉有效字符前面的无效字符，
                对输入有效字符之前遇到的空格键、Tab键或Enter 键等结束符，next()方法会自动将其过滤掉；
                只有在读取到有效字符之后，next()方法才将其后的空格键、Tab键或 Enter键等视为结束符；
                所以next()方法不能得到带空格的字符串
            nextLine()方法字面上有扫描一整行的意思，它的结束符只能是Enter键，
                即nextLine()方法返回的是Enter键之前没 有被读取的所有字符，它是可以得到带空格的字符串的。

Test2：
    java.util.Random
        生成伪随机数
        ran.nextInt(n)
            生成范围在 0（包括）和 指定值 n（不包括）之间的 int 值
            可以读取其他数字类型，如：ran.nextDouble()

Test4：
    ArrayList
        不固定长度
        有序、元素可以重复
        ArrayList<String> arrayList = new ArrayList();

        add(元素)
            向末尾添加添加
            arrayList.add("零");
        remove(下标)
            通过下标删除元素
            arrayList.remove(0);
        set(下标, 新元素)
            通过下标修改
            arrayList.set(0, "新");
        get(下标)
            通过下标获取
            System.out.println(arrayList.get(0));
        size()
            获取集合长度
            System.out.println(arrayList.size());

        包装类型
            默认值：null
            基本类型    基本包装类型
            byte            Byte
            short           Short
            int               Integer - 特殊
            long            Long
            float            Float
            double        Double
            char            Character - 特殊
            boolean      Boolean

        遍历集合
            for(int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i));
            }

shift+F6 整块修改代码
*/

    }

    // String、static、Arrays、Math
    public void day6() {

/*
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

    // 继承、抽象类
    public void day7() {

/*
Test1
    继承extends：
        就是子类继承父类的属性和行为，使得子类对象具有与父类相同的属性、相同的行为。
        子类可以直接 访问父 类中的非私有的属性和行为。
    继承好处
        1. 提高代码的复用性。
        2. 类与类之间产生了关系，是多态的前提。
    父类不可被继承的内容
        1. 被private修饰的
        2. 构造方法不能继承

    继承后的特点——成员变量：
        子父类中出现了同名的成员变量时，在子类中需要访问父类中非私有成员变量时，
        需要使用 super 关键字，修饰父类成员变量。
    继承后的特点——方法重写 ：
        子类中出现与父类一模一样的方法时（返回值类型，方法名和参数列表都相同），
        会出现覆盖效果，也称为重写或者复写。声明不变，重新实现。
    继承后的特点——构造方法：
        1. 构造方法的名字是与类名一致的。所以子类是无法继承父类构造方法的。
        2. 构造方法的作用是初始化成员变量的。所以子类的初始化过程中，必须先执行父类的初始化动作。
            子类的构造方法中默认有一个super()，表示调用父类的构造方法，
            父类成员变量初始化后，才可以给子类使用。
        3. 继承后子类构造方法特点：子类所有构造方法都会调用父类的无参构造

    super和this
        super ：代表父类的存储空间标识(可以理解为父亲的引用)。
        this ：代表当前对象的引用(谁调用就代表谁)。

        this.成员变量 ‐‐ 本类的
        super.成员变量 ‐‐ 父类的
        this.成员方法名() ‐‐ 本类的
        super.成员方法名() ‐‐ 父类的

        this(...) ‐‐ 本类的构造方法
        super(...) ‐‐ 父类的构造方法
            子类的每个构造方法中均有默认的super()，调用父类的空参构造。
            手动调用父类构造会覆盖默认的super()。
            super() 和 this() 都必须是在构造方法的第一行，所以不能同时出现。

    继承的特点
        1. Java只支持单继承，不支持多继承。
        2. 一个类可以有多个子类。
        3. Java支持多层继承(继承体系)。
            顶层父类是Object类。所有的类默认继承Object，作为父类。
        4. 子类和父类是一种相对的概念。

    老师笔记
        1子类只能继承父类非私有的属性和行为，构造方法不能继承
        2.如果子类和父类中出现重名的成员方法叫做方法重写 (Override)
        3重写和重载的特征，区别？
        4子类方法覆盖父类方法，必须要保证权限大于等于父类权限
        5继承后子类构造方法特点:子类所有构造方法（包含无参和有参）都会默认调用父类的无参构造（supper()）
        6子类的初始化过程中，必须先执行父类的初始化动作，然后在执行子类的初始化动作
        7.supper和this的用法
        8.super() 和 this() 都必须是在构造方法的第一行，所以不能同时出现
        9.单继承多实现

Test2：
    抽象方法：没有方法体的方法。
        使用 abstract 关键字修饰方法，该方法就成了抽象方法，抽象方法只包含一个方法名，而没有方法体。
    抽象类：包含抽象方法的类。
        如果一个类包含抽象方法，那么该类必须是抽象类。
        使用abstract 修饰的类就是抽象类。
        抽象类不一定有抽象方法。

    抽象类的特征：
        1、如果类包含抽象方法，那么这个类必须被声明位抽象类
        2、抽象类不一定要包含抽象方法
        3、子类要么实现父类中所有的抽象方法，要么声明成抽象类
        4、抽象类不能实例化(new)，实现类可以实例化

        Ctrl + O 重写父类方法

*/
    }

    // 接口、多态
    public void day8() {
/*

test1：
    接口：
        接口interface 不是类class
        接口比抽象类更抽象——抽象类是对类的抽象，接口是对行为的抽象
        接口中只能含有非抽象方法、默认方法、静态方法（JDK1.8）
            JDK1.9 可以还包含私有方法
        public interface 接口名称 {
            // 抽象方法
            // 默认方法
            // 静态方法
            // 私有方法
        }
    多实现
        子类实现父接口，要么声明成抽象类，要么实现接口中所有的抽象方法，
            继承了接口的默认方法，即可以直接调用，也可以重写。
        抽象方法：需要实现所有接口的所有抽象方法，如果抽象方法重名，只需重写一次
        默认方法：重名的默认方法必须重写，不重名的默认方法不用重写
        静态方法：静态方法只能通过各自的接口名称调用，不会出现重名冲突
        优先级：当一个类，既继承一个父类，又实现若干个接口时，
            父类中的成员方法与接口中的默认方法重名，子类就近选择执行父类的成员方法。
    多继承
        只有接口才能多继承接口，类只能单继承
    接口成员特点
        接口中，无法定义成员变量，但是可以定义常量，其值不可以改变，默认使用public static final修饰
            常量命名必须大写，如果遇到驼峰式，则加上下划线_：USER_NAME
        接口没有构造方法，不能创建对象
        接口没有静态代码块

    接口和抽象类的区别

test2：
    多态： 是指同一行为，具有多个不同表现形式。
    前提
        1. 继承或者实现【二选一】
        2. 方法的重写【意义体现：不重写，无意义】
        3. 父类引用指向子类对象【格式体现】
            父类类型 变量名 = new 子类对象;
    调用方法：
        当使用多态方式调用方法时，首先检查父类中是否有该方法，
        如果没有，则编译错误；如果有，执行的是子类重写后方法。
    多态的好处：
        实际开发的过程中，父类类型作为方法形式参数，
        传递子类对象给方法，进行方法的调用，更能体现出多态的扩展性与便利。
    引用类型转换：
        向上转型：
            多态本身是子类类型向父类类型向上转换的过程，这个过程是默认的。
            当父类引用指向一个子类对象时，便是向上转型。
                父类类型 变量名 = new 子类类型();
        向下转型：
            父类类型向子类类型向下转换的过程，这个过程是强制的。
            一个已经向上转型的子类对象，将父类引用转为子类引用，
            可以使用强制类型转换的格式，便是向下转型。
                子类类型 变量名 = (子类类型) 父类变量名;
        类型转换异常 ClassCaseException
    instanceof
        变量名 instanceof 数据类型
        如果变量属于该数据类型，返回true。
        如果变量不属于该数据类型，返回false。

test3：
    抽象类 extends  abstract
        包含抽象方法的一定是抽象类，但是抽象类不一定包含抽象方法
        子类如果继承抽象类，要么实现父类中所有的抽象方法，要么把自己定义成抽象类
        抽象类不能实例化，只能实例化它的实现类
        抽象类可以有构造方法，构造方法不能被继承
    接口 interface  implement
        接口就是比抽象类更抽象
        接口不是类
        接口包含抽象方法，默认方法，静态方法，私有方法(JDK1.9)
        接口没有构造函数，也不能实例化
        接口中的成员变量叫做常量(public static final)
        单继承 (类与类) 多实现 (类与接口)
        接口和接口之间可以多继承，类和类之间不能多继承

ctrl + shift + u 大小写切换

*/
    }

    // final、权限修饰符、内部类、lambda表达式、stream
    public void day9() {

/*
Test1：
    final： 不可改变。可以用于修饰类、方法和变量。
        类：被修饰的类，不能被继承。
        方法：被修饰的方法，不能被重写。
        变量：被修饰的变量，不能被重新赋值。
            1、局部变量——基本类型
                基本类型的局部变量，被final修饰后，只能赋值一次，不能再更改。
                public static void main(String[] args) {
                    //声明局部变量,使用final修饰
                    final int a; //第一次赋值
                    a=10; //第二次赋值
                    // a=20; //报错,不能重新赋值
                }
            2、局部变量——引用类型
                引用类型的局部变量，被 final 修饰后，只能指向一个对象，地址不能再更改。
                但是不影响对象内部的成员 变 量值的修改
                public static void main(String[] args) {
                    //创建Person对象
                    final Person p=new Person();
                    // p=new Person(); //被final修饰的对象不可指向其他地址值
                    p.setName("张三"); //可以修改此对象的属性值
                }
            3、成员变量
                成员变量涉及到初始化的问题，初始化方式有两种，只能二选一：
                    显示初始化(在定义成员变量的时候立马赋值)
                        public class Student{
                            final int num=10;
                        }
                    构造方法初始化(在构造方法中赋值一次)
                        class Student{
                            final int num=10;
                            final int hw2;
                            public Student (){
                                this.hw2=20; //赋值一次后，不可再次赋值
                                // this.hw2=30;
                            }
                            public Student(int i){
                                //如果有多个构造方法,那么所有的构造方法中必须都得给num2赋值
                                this.hw2=30;
                            }
                        }
Test2：
    权限修饰符 public > protected > 默认 > private
        public：公共的
        protected：受保护的
        default：默认的
        private：私有的
                                                public          protected           default             private
            同一类中                         √                   √                       √                   √
            同一包中(子类或任意类)    √                   √                       √
            不同包的子类                   √                   √
            不同包的任意类                √

Test4：
    内部类
        将一个类A定义在另一个类B里面，里面的那个类A就称为内部类，B则称为外部类
        1. 成员内部内，类定义在了成员位置 (类中方法外称为成员位置)
            内部类可以直接访问外部类的成员，包括私有成员。
            外部类名.内部类名 对象名 = new 外部类型().new 内部类型();
                class 外部类{
                    // 成员变量
                    // 成员方法
                    class 内部类{
                        // 成员变量
                        // 成员方法
                    }
                }

        2. 局部内部类，类定义在方法内
            使用方式: 在定义好局部内部类后,直接就创建对象
            内部类可以直接访问外部类的成员，包括私有成员。
                class 外部类名 {
                    数据类型 变量名;
                    修饰符 返回值类型 方法名(参数列表) {
                        class 内部类 {
                            成员变量
                            成员方法
                        }
                    }
                }
        3. 匿名内部类
            匿名内部类的本质
                1. 定义一个没有名字的内部类
                2. 这个类实现了Swim接口
                3. 创建了这个没有名字的类的对象
            通常在方法的形式参数是接口或者抽象类时，也可以将匿名内部类作为参数传递
            new 父类名或者接口名(){
                // 方法重写
                @Override
                public void method() {
                    // 执行语句
                }
            };

Test4：
    Lambda标准格式
        一些参数
        一个箭头
        一段代码
        Lambda表达式的标准格式为：
            (参数类型 参数名称) -> { 代码语句 }
        小括号内的语法与传统方法参数列表一致：无参数则留空；多个参数则用逗号分隔。
        -> 是新引入的语法格式，代表指向动作。
        大括号内的语法与传统方法体要求基本一致。
    要求接口要只能有一个抽象类

Test5：
    stream 流
        list.stream()：将list 转换成stream
        forEach(n)：遍历
        filter(n)：过滤
        collect(Collect.toList())：转换成List 集合
        concat(a, b)：拼接
            Stream<E> cStream = Stream.concat(aStream, bStream);
        limit(n)：前n 个
        skip(n)：跳过
        count()：统计流中元素个数
        sorted(a, b)：排序
        map：映射

额外作业：
    student(name,age，score)
    List<Student>list=new ArrayList<>();
    List<Student>list2=new ArrayList<>();
    班级a有若干学生
    班级b有若干学生

    1.打印总共有多少姓张的学生的个数
    2.先按年龄降序，再按成绩升序排序
    3.打印2个班级中前3个姓张且年龄小于18岁的学生信息

*/

    }

    // System、StringBuilder类、Date类、DateFormat类、Calendar类、Object类、Objects类、包装类
    public void day10() {
    /*
Test1：
    System 类
        public static long currentTimeMillis()
            返回以毫秒为单位的当前时间。
        public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
            将数组中指定的数据拷贝到另一个数组中。
                Object 源数组
                srcPos 源数组索引起始位置
                dest 目标数组
                destPos 目标数组索引起始位置
                length 复制元素个数

    StringBuilder类
        public StringBuilder()
            构造一个空的StringBuilder容器。
        public StringBuilder(String str)
            构造一个StringBuilder容器，并将字符串添加进去。
        public StringBuilder append(...)
            添加任意类型数据的字符串形式，并返回当前对象自身。
        public String toString()
            将当前StringBuilder对象转换为String对象。

        速度：StringBuilder > StringBuffer > String
        线程安全：
            StringBuffer：线程安全
            StringBuilder：线程不安全，没有重写equals 方法

    Date类
        public Date()
            分配Date对象并初始化此对象，以表示分配它的时间（精确到毫秒）。
        public Date(long date)
            分配Date对象并初始化此对象，以表示自从标准基准时间以来的指定毫秒数
        public long getTime()
            把日期对象转换成对应的时间毫秒值。

    DateFormat类
        由于DateFormat为抽象类，不能直接使用，所以需要常用的子类 java.text.SimpleDateFormat
        public SimpleDateFormat(String pattern)
            用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat。
        public String format(Date date)
            将Date对象格式化为字符串。
        public Date parse(String source)
            将字符串解析为Date对象。
             y - 年
            M - 月    MM(大写)=月
            d - 日
            H - 时    HH(大写)=24 小时制    hh(小写)=12 小时制
            m -分    mm(小写)=分
            s - 秒
            sss(小写)-毫秒
                补充：大写也可以

    Calendar类
        是日历类，在Date后出现，替换掉了许多Date的方法。
        该类将所有可能用到的时间信息封装 为静态成员变量，方便获取。
        日历类就是方便获取各个时间属性的。
        public static Calendar getInstance()
            使用默认时区和语言环境获得一个日历
        public int get(int field)
            返回给定日历字段的值。
        public void set(int field, int value)
            将给定的日历字段设置为给定值。
        public abstract void add(int field, int amount)
            根据日历的规则，为给定的日历字段添加或减去指 定的时间量。
        public Date getTime()
            返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。

            字段值                     含义
            YEAR                        年
            MONTH                   月（从0开始，可以+1使用）
            DAY_OF_MONTH     月中的天（几号）
            HOUR                      时（12小时制）
            HOUR_OF_DAY        时（24小时制）
            MINUTE                  分
            SECOND                  秒
            DAY_OF_WEEK         周中的天（周几，周日为1，可以-1使用）

Test2：
    Object类
        public String toString()
            返回该对象的字符串表示。
        public boolean equals(Object obj)
            指示其他某个对象是否与此对象“相等”。

        三个注意：
            2个字符串的值相同，它们hashCode 一定相同
            hashCode 相同，值不一定相同
            重写equals方法，一定要重写hashCode方法

    Objects类
        public static boolean equals(Object a, Object b)
            判断两个对象是否相等。

    包装类
        基本类型        对应的包装类（位于java.lang包中）
        byte                Byte
        short               Short
        int                   Integer
        long                Long
        float                Float
        double            Double
        char                Character
        boolean          Boolean
    装箱
        从基本类型转换为对应的包装类对象。
        Integer i = Integer.valueOf(4);
    拆箱
        从包装类对象转换为对应的基本类型。
        int value = i.intValue();
    自动装箱与自动拆箱
        基本类型与包装类的装箱、拆箱动作 可以自动完成。
    基本类型与字符串之间的转换
        Integer 转字符串：String.valueOf(123);
        字符串转 Integer：public static int parseInt(String s)
            除了Character类之外，其他所有包装类都具有parseXxx静态方法可以将字符串参数转换为对应的基本类型

*/

    }

    // Collection集合、Iterator迭代器、泛型
    public void day11() {
        /*

Test1：
    Collection集合
        集合按照其存储结构可以分为两大类，分别是
        单列集合 java.util.Collection 和双列集合 java.util.Map

        Collection：List、Set
            List：ArrayList、LinkedList、Vector
            Set：HashSet、LinkedHashSet
        Collection 常用功能
            public boolean add(E e)
                把给定的对象添加到当前集合中。
            public boolean remove(E e)
                把给定的对象在当前集合中删除。
            public void clear()
                清空集合中所有的元素。
            public boolean contains(E e)
                判断当前集合中是否包含给定的对象。
            public boolean isEmpty()
                判断当前集合是否为空。
            public int size()
                返回集合中元素的个数。
            public Object[] toArray()
                把集合中的元素，存储到数组中。

    Iterator迭代器
        public E next()
            返回迭代的下一个元素。
        public boolean hasNext()
            如果仍有元素可以迭代，则返回 true。

Test2：
    泛型：可以在类或方法中预支地使用未知的类型。
        tips:一般在创建对象时，将未知的类型确定具体的类型。当没有指定泛型时，默认类型为Object类型。
        接口：
            修饰符 interface接口名<代表泛型的变量> { }
        类：
            修饰符 class 类名<代表泛型的变量> { }
        方法：
            修饰符 <代表泛型的变量> 返回值类型 方法名(参数){ }
        泛型通配符：
            当使用泛型类或者接口时，传递的数据中，泛型类型不确定，可以通过通配符<?>表示
            但是一旦使用泛型的通配 符后，只能使用Object类中的共性方法，集合中元素自身方法无法使用。
            public static void getElement(Collection<?> coll){}
        泛型的上限：
            类型名称 <? extends 类 > 对象名称
            只能接收该类型及其子类
        泛型的下限：
            类型名称 <? super 类 > 对象名称
            只能接收该类型及其父类型
    泛型的好处：
        将运行时期的ClassCastException，转移到了编译时期变成了编译失败。
        避免了类型强转的麻烦。
        tips:泛型是数据类型的一部分，我们将类名与泛型合并一起看做数据类型。

    集合遍历：for 循环，增强for 循环，stream 流，迭代器

    Collections.shuffle(list); // 打乱集合的元素

*/
    }

    // 单列集合、Collections类
    public void day12() {
        /*
Test1：
    Collection：List、Set
    List：ArrayList、LinkedList  有序、可以重复

        public void add(int index, E element)
            将指定的元素，添加到该集合中的指定位置上。
        public E set(int index, E element)
            用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
        public E get(int index)
            返回集合中指定位置的元素。
        public E remove(int index)
            移除列表中指定位置的元素, 返回的是被移除的元素。
        public boolean contains(Object o)
            如果此列表包含指定的元素，则返回 true 。

        ArrayList
            增删慢，查找快
        LinkedList
            增删快，查找慢

            public void addFirst(E e) :将指定元素插入此列表的开头。
            public void addLast(E e) :将指定元素添加到此列表的结尾。
            public E getFirst() :返回此列表的第一个元素。
            public E getLast() :返回此列表的最后一个元素。
            public E removeFirst() :移除并返回此列表的第一个元素。
            public E removeLast() :移除并返回此列表的最后一个元素。

            public E pop() :从此列表所表示的堆栈处弹出一个元素。
            public void push(E e) :将元素推入此列表所表示的堆栈。
            public boolean isEmpty() ：如果列表不包含元素，则返回true。

    Set：HashSet、LinkedHashSet
        HashSet：无序，不能重复
        LinkedHashSet：有序，不能重复
        去重原理：先判断HashCode是否相同，如果相同，再比较equals

Test2：
    Collections
        是集合工具类，用来对集合进行操作。

        public static <T> boolean addAll(Collection<T> c, T... elements)
            往集合中添加一些元素。
        public static void shuffle(List<?> list)
            打乱顺序 :打乱集合顺序。
        public static <T> void sort(List<T> list)
            将集合中元素按照默认规则排序。
        public static <T> void sort(List<T> list，Comparator<? super T> )
            将集合中元素按照指定规则排序。
        Collections.reverse(list);
            反转集合内容

        排序
            方式一：
                Collections.sort(list);
            方式二：
                list.sort((a, b) -> {
                    return b - a;
                });

Test4：
    实现Comparable 接口，再使用Collections 的sort(List<T> list) 方法，给自定义元素的集合排序

    扩容：
        HashSet：默认阈值为8，超过之后将链表存储改为红黑数
        ArrayList：默认长度为10，扩容1.5 倍，最大值Integer.MAX_VALUE - 8
        HashMap：默认长度为16，扩容2 倍，最大值为2 的30 次幂

*/
    }

    // map 集合、异常、纸牌案例
    public void day13() {
            /*

Test1：
    Map<key, value>：
        public V put(K key, V value) :
            把指定的键与指定的值添加到Map集合中。
        public V remove(Object key)
            把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的 值。
        public V get(Object key)
            根据指定的键，在Map集合中获取对应的值。
        boolean containsKey(Object key)
            判断集合中是否包含指定的键。
        public Set<K> keySet()
            获取Map集合中所有的键，存储到Set集合中。
        public Set<Map.Entry<K,V>> entrySet()
            获取到Map集合中所有的键值对对象的集合(Set集合)。

    HashMap：
        无序，key 和value 可以同时为空null
        key不可重复、key可以为空
        value可以重复、value可以为空
            存储数据采用的哈希表结构，元素的存取顺序不能保证一致。
            由于要保证键的唯一、不重复，需要重写键的hashCode()方法、equals()方法。

    LinkedHashMap：
        有序，key 和value 可以同时为空null
        key不可重复、key可以为空
        value可以重复、value可以为空
            HashMap下有个子类LinkedHashMap，存储数据采用的哈希表结构+链表结构。
            通过链表结构可以保证元素的存取顺序一致；
            通过哈希表结构可以保证的键的唯一、不重复，需要重写键的 hashCode()方法、equals()方法。

    不同集合的区别
        Collection 中的集合，元素是孤立存在的（理解为单身），向集合中存储元素采用一个个元素的方式存储
        Map 中的集合，元素是成对存在的(理解为夫妻)。每个元素由键与值两部分组成，通过键可以找对所对应的值
        Collection 中的集合称为单列集合， Map 中的集合称为双列集合。

        遍历方式：Set、Map.Entry
            增强for
            迭代器
            流与lambda表达式

Test2：纸牌案例

Test4：
    异常：
        异常的根类是 java.lang.Throwable
            其下有两个子类：java.lang.Error 与 java.lang.Exception
            平常所说的异常指 java.lang.Exception
        Throwable中的常用方法：
            public void printStackTrace() :打印异常的详细信息。
                包含了异常的类型,异常的原因,还包括异常出现的位置,
                在开发和调试阶段,都得使用printStackTrace。
            public String getMessage()
                获取发生异常的原因。提示给用户的时候,就提示错误原因。
            public String toString()
                获取异常的类型和异常描述信息(不用)。

        编译时期异常:
            checked异常。在编译时期,就会检查,如果没有处理异常,则编译失败。(如日期格式化异常)
        运行时期异常:
            runtime异常。在运行时期,检查异常.在编译时期,运行异常不会编译器检测(不报错)。(如数学异常)

        声明异常throws
            声明异常：将问题标识出来，报告给调用者。
                如果方法内通过throw抛出了编译时异常，而没有捕获处理，那么必须通过throws进行声明，
                让调用者去处理。
                    修饰符 返回值类型 方法名(参数) throws 异常类名1,异常类名2…{
                        throw new 异常类名1();
                        throw new 异常类名2();
                    }
            捕获异常try…catch
                try{
                    编写可能会出现异常的代码
                }catch(异常类型 e){
                    处理异常的代码 //记录日志/打印异常信息/继续抛出异常
                } finally {
                    不论是否有异常，必须执行的代码（可以没有）
                }

        1. 方法重写，子类只能抛比父类小的异常(父类所抛异常或父类所抛异常的子类)
            a. 重写方法不能抛出与父类平级的其他异常
            b. 重写方法不能抛出比父类高级的异常
            c. 重写方法: 可以抛出和父类同样的异常
            d. 重写方法: 可以抛出父类抛出异常的子类异常
            e. 重写方法: 可以抛出多个 "父类抛出异常的子类异常".
        2. 方法重写，父类没有抛异常，子类重写父类方法也不能抛异常?
            a. 父类不抛出异常,子类也不能抛出异常
            b. 如果子类内部抛出了异常(或调用抛出异常的方法)只能自己处理,不允许向外抛.
        注：这里所说的异常都是编译异常。


    Ctrl + Alt + T 生成捕获异常代码

*/
    }

    // 线程、同步代码块
    public void day14() {
        /*

Test1：
    线程
        Thread类常用方法
            public Thread() :分配一个新的线程对象。
            public Thread(String name) :分配一个指定名字的新的线程对象。
            public Thread(Runnable target) :分配一个带有指定目标新的线程对象。
            public Thread(Runnable target,String name) :分配一个带有指定目标新的线程对象并指定名字。

            public String getName()
                获取当前线程名称。
            public void start()
                导致此线程开始执行; Java虚拟机调用此线程的run方法。
            public void run()
                此线程要执行的任务在此处定义代码。
            public static void sleep(long millis)
                使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）。
            public static Thread currentThread()
                返回对当前正在执行的线程对象的引用。

        创建线程方式
            继承Thread类
                public class MyThread extends Thread {
                    @Override
                    public void run() {
                    }
                }
                new MyThread().start();

            实现Runnable接口
                public class MyRunnable implements Runnable {
                    @Override
                    public void run() {
                    }
                }
                new Thread(new MyRunnable()).start();

                new Thread(() -> {
                    System.out.println("lambda方式");
                }).start;

                Thread t3 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("匿名内部类方式");
                    }
                }).start();

Test2：
        线程的睡眠
            public static void sleep(long millis)
                让当前线程睡眠指定的毫秒数

        线程加入
            public final void join()
                让线程在此线程优先执行,直至此线程执行完毕时,再执行当前线程
            public final void join(long millis)
                让此线程执行millis毫秒,再执行其他线程

        守护线程
            不管开启多少个线程(用户线程),守护线程总是随着第一个用户线程的停止而停止
                public final void setDaemon(boolean on)
                    设置线程是否为守护线程

        线程优先级
            public final void setPriority(int newPriority)
                设置线程的优先级，线程优先级默认为5 最高为10 最低为1
                如果不在这个范围之内则会抛出.不合法参数异常 (IllegalArgumentException)

        线程礼让
            public static void yield()
                线程礼让，告知当前线程可以将执行权礼让给其他线程，
                礼让给优先级相对高一点的线程，
                但仅仅是一种告知,并不是强制将执行权转让给其他线程.
                也有可能下次的执行权还在原线程这里。

        线程等待 Object 方法
            wait 和notify 方法要在synchronized 同步块中执行，且需要使用锁对象调用
            public void wait()
                导致当前线程等待，直到另一个线程调用该对象的 notify()方法或 notifyAll()方法
            void wait(long timeout)
                导致当前线程等待，直到另一个线程调用 notify()方法或该对象的 notifyAll()方法，或者指定的时间已过。
            public void notify()
                唤醒正在等待对象监视器的单个线程
            public void notifyAll()
                唤醒正在等待对象监视器的所有线程

            调用wait和notify方法需要注意的细节
                1. wait方法与notify方法必须要由同一个锁对象调用。
                    因为：对应的锁对象可以通过notify唤醒使用同一个锁对象调用的wait方法后的线程。
                2. wait方法与notify方法是属于Object类的方法的。
                    因为：锁对象可以是任意对象，而任意对象的所属类都是继承了Object类的。
                3. wait方法与notify方法必须要在synchronized 同步代码块或者是同步函数中使用。
                    因为：必须要通过锁对象调用这2个方法。

            wait 和sleep 的区别：
                wait 会释放锁，sleep 不会释放锁
                sleep会在指定时间醒来，wait在不传参数的情况下不会自动醒


Test4：
        同步
            同步代码块：
            synchronized 关键字可以用于方法中的某个区块中，表示只对这个区块的资源实行互斥访问。
                synchronized(同步锁){
                    需要同步操作的代码
                }
            同步方法
                使用synchronized修饰的方法,就叫做同步方法,保证A线程执行该方法的时候,其他线程只能在方法外等着
                    public synchronized void method(){
                        可能会产生线程安全问题的代码
                    }

        锁
            java.util.concurrent.locks.Lock
                机制提供了比synchronized代码块和synchronized方法更广泛的锁定操作,
                同步代码块/同步方法具有的功能Lock都有,除此之外更强大,更体现面向对象。
            Lock锁也称同步锁，加锁与释放锁方法化了，如下：
                public void lock() :加同步锁。
                public void unlock() :释放同步锁。

                    //创建锁对象
                    ReentrantLock lock = new ReentrantLock();
                    //开启锁
                    lock.lock();
                    //释放锁
                    lock.unlock();

Test4：
    线程状态：
        NEW(新建)
        Runnable(可运行)
        Blocked(锁阻塞)
        Waiting(无限等待)
        TimedWaiting(计时等待)
        Terminated(被终止)

*/
    }

    // 线程死锁、线程通信
    public void day15() {
        /*

Test1：
    线程死锁问题
        多线程同步的时候, 如果同步代码嵌套, 使用相同锁, 就有可能出现死锁

Test2：
    wait 与notify 使用

Test3：
    wait 与notify 通信

Test4：
    监视器 Condition 通信
        Condition c = new ReentrantLock().newCondition();
        c.await(); // 等待
        c.signal() // 唤醒

Test5：
    Callable 接口（了解）
        V call() throws Exception;
            调用方法

作业：
    多窗口卖票
    卖包子

*/
    }

    // 线程池、File类
    public void day16() {
            /*

Test1：
    线程池：其实就是一个容纳多个线程的容器，其中的线程可以反复使用，
        省去了频繁创建线程对象的操作，无需反复创建线程而消耗过多资源。
    合理利用线程池能够带来三个好处：
        1. 降低资源消耗。减少了创建和销毁线程的次数，每个工作线程都可以被重复利用，可执行多个任务。
        2. 提高响应速度。当任务到达时，任务可以不需要的等到线程创建就能立即执行。
        3. 提高线程的可管理性。可以根据系统的承受能力，调整线程池中工作线线程的数目，
            防止因为消耗过多的内存，而把服务器累趴下(每个线程需要大约1MB内存，
            线程开的越多，消耗的内存也就越大，最后死机)。
    线程池接口是
        java.util.concurrent.ExecutorService
    官方建议使用Executors工程类来创建线程池对象
        public static ExecutorService newFixedThreadPool(int nThreads)
            返回线程池对象。(创建的是有界线程池,也就是池中的线程个数可以指定最大数量)
        public Future<?> submit(Runnable task)
            获取线程池中的某一个线程对象，并执行
            Future接口：用来记录线程任务执行完毕后产生的结果。线程池创建与使用。

Test2：
    File
        java.io.File 类是文件和目录路径名的抽象表示，主要用于文件和目录的创建、查找和删除等操作。
        构造方法
            public File(String pathname)
                通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例
            public File(String parent, String child)
                从父路径名字符串和子路径名字符串创建新的 File实例
            public File(File parent, String child)
                从父抽象路径名和子路径名字符串创建新的 File实例

        获取功能的方法
            public String getAbsolutePath()
                返回此File的绝对路径名字符串。
            public String getPath()
                将此File转换为路径名字符串。
            public String getName()
                返回由此File表示的文件或目录的名称。
            public long length()
                返回由此File表示的文件的长度。

        判断功能的方法
            public boolean exists()
                此File表示的文件或目录是否实际存在
            public boolean isDirectory()
                此File表示的是否为目录
            public boolean isFile()
                此File表示的是否为文件

        创建删除功能的方法
            public boolean createNewFile()
                当且仅当具有该名称的文件尚不存在时，创建一个新的空文件
            public boolean delete()
                删除由此File表示的文件或目录
                如果此File表示目录，则目录必须为空才能删除。
            public boolean mkdir()
                创建由此File表示的目录
            public boolean mkdirs()
                创建由此File表示的目录，包括任何必需但不存在的父目录

        目录的遍历
            调用listFiles方法的File对象，表示的必须是实际存在的目录，否则返回null，无法进行遍历。
            public String[] list()
                返回一个String数组，表示该File目录中的所有子文件或目录。
            public File[] listFiles()
                返回一个File数组，表示该File目录中的所有的子文件或目录。

Test3：
    递归
        递归一定要有结束条件
        返回值类型和传入的参数类型一致（不是必须）

Test4：
    创建文件夹与文件代码
    删除文件夹与文件代码
    计算文件夹与文件大小
    计算同类型文件个数

*/
    }

    // 字节流、字符流、属性集
    public void day17() {
         /*

Test1：字节流（使用字节byte）
        字节输出流【OutputStream】
            FileOutputStream 类是文件输出流，用于将数据写出到文件。

            public void closeSocket()
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

            public void closeSocket()
                关闭此输入流并释放与此流相关联的任何系统资源。
            public abstract int read()
                从输入流读取数据的下一个字节。
            public int read(byte[] b)
                从输入流中读取一些字节数，并将它们存储到字节数组 b中 。

Test2：字符流（使用字符char，要flush）
    字符输入流【Reader】
        FileReader 类是读取字符文件的便利类。构造时使用系统默认的字符编码和默认字节缓冲区。

        public void closeSocket()
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
        void closeSocket()
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

    // 缓冲流、转换流、序列化流、打印流
    public void day18() {
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
            System.out.println("test"); // 将会打印到demo.txt 中

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

    // TCP通信
    public void day19() {
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

}





























