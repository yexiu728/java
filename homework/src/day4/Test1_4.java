package day4;

public class Test1_4 {
    public static void main(String[] args) {
        char aChar = getChar(122);
        System.out.println("字符：" + aChar);
    }

    public static char getChar(int num) {
        if (num >= 'a' && num <= 'z') {
            // 小写字母 97-122
            return (char) num;
        }
        if (num >= 'A' && num <= 'Z') {
            // 大写字母 65-90
            return (char) num;
        }
        if (num >= '0' && num <= '9') {
            // 数字 48-57
            return (char) num;
        }

        return ' ';
    }
}
