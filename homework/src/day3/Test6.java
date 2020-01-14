package day3;

public class Test6 {
    public static void main(String[] args) {
        System.out.println("水仙花数有：");
        for(int i = 100; i <= 999; i++) {
            int g = i % 10;
            int s = i / 10 % 10;
            int b = i / 100;
            boolean flag = g * g * g + s * s * s + b * b * b == i;
            if(flag) {
                System.out.print(i + "  ");
            }
        }
    }
}
