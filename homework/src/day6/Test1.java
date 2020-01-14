package day6;

public class Test1 {
    public static void main(String[] args) {
        String str1 = new String("你好");
        String str2 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        String str3 = new String("abcde".getBytes());

        System.out.println("方式一创建字符串：" + str1);
        System.out.println("方式二创建字符串：" + str2);
        System.out.println("方式三创建字符串：" + str3);

    }
}
