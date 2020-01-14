package day4;

public class Test1_7 {
    public static void main(String[] args) {
        double num = 10.1;
        System.out.println(num + " -> " + round(num));
        num = 10.4;
        System.out.println(num + " -> " + round(num));
        num = 10.5;
        System.out.println(num + " -> " + round(num));
        num = 10.9;
        System.out.println(num + " -> " + round(num));
    }

    public static int round(double num) {
        return (int)(num + 0.5);
    }
}
