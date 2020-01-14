package day10;

public class Test0 {
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



*/
}
