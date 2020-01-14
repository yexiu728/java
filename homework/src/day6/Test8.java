package day6;

public class Test8 {
    public static void main(String[] args) {

        String str = "javajfiewjavajfiowfjavagkljjava";

        System.out.println(str + " 字符串中的java 数量：" + getCount(str, "java"));

    }

    public static int getCount(String str, String ch) {

        int count = 0;
        int index = str.indexOf(ch);

        while(index != -1) {
            str = str.substring(index + ch.length());
            index = str.indexOf(ch);
            count++;
        }

        return count;
    }
}
