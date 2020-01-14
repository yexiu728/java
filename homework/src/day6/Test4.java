package day6;

public class Test4 {
    public static void main(String[] args) {
        String str = "HelloWorld";

        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("将str 字符串转换为小写：" + str.toLowerCase());
        System.out.println("将str 字符串转换为大写：" + str.toUpperCase());
        System.out.println("将str 字符串中的字符'o' 替换成'6'：" + str.replace('o', '6'));
        System.out.println("将str 字符串中的字符串ll 替换成LL：" + str.replace("ll", "LL"));

    }
}
