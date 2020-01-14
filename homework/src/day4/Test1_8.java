package day4;

public class Test1_8 {
    public static void main(String[] args) {
        double s = 30.0;
        System.out.println("摄氏度为：" + s + "° -- 华氏度为：" + getH(s) + "°");
        double h = 86.0;
        System.out.println("华氏度为：" + h + "° -- 摄氏度为：" + getS(h) + "°");
    }

    // 摄氏度转华氏度
    public static double getH(double w) {
        return w * 1.8 + 32;
    }

    // 华氏度转摄氏度
    public static double getS(double h) {
        return (h-32) / 1.8;
    }
}
