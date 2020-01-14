package day6;

public class Test3 {
    public static void main(String[] args) {
        String str = "HelloWorld广州";

        System.out.println("str 字符串的长度：" + str.length());
        System.out.println("str 字符串索引为2 的char 值：" + str.charAt(2));
        System.out.println("字符串o 第一次出现在str 字符串中的索引：" + str.indexOf("o"));
        System.out.println("截取字符串str 从索引6 开始到结束：" + str.substring(6));
        System.out.println("截取字符串str 从索引2 开始到索引7：" + str.substring(2, 7));

    }
}
