package day10.hw2;

public class Test2 {
    public static void main(String[] args) {
        int num = 10000;

        String str = "";
        long strStart = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            str += "a";
        }
        long strEnd = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        long sbStart = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            sb.append("a");
        }
        long sbEnd = System.currentTimeMillis();

        System.out.println("String 用时：" + (strEnd - strStart) + " 毫秒");
        System.out.println("StringBuilder 用时：" + (sbEnd - sbStart) + " 毫秒");

    }
}
