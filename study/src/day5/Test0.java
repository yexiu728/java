package day5;

public class Test0 {
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


// 最贵，大到小排序，倒序
// 取出工资前三名，放入另外一个集合中遍历出来

shift+F6 整块修改代码

*/
}
