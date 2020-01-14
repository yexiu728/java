package day6;

public class Test2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "Hello";

        System.out.println("str1 和str2 内容是否相等：" + str1.equals(str2));
        System.out.println("str1 和str3 内容是否相等：" + str1.equals(str3));
        System.out.println("忽略大小写比较str1 和str3 内容是否相等：" + str1.equalsIgnoreCase(str3));
        System.out.println("str1 字符串是否以He 前缀开头：" + (str1.indexOf("He") == 0));
        System.out.println("str1 字符串是否以abc 前缀开头：" + (str1.indexOf("abc") == 0));
        System.out.println("str1 字符串是否以o 后缀结尾：" + (str1.indexOf("o") == str1.length() - 1));
        System.out.println("str1 字符串是否以l 后缀结尾：" + (str1.indexOf("l") == str1.length() - 1));

    }
}
