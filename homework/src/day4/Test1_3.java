package day4;

public class Test1_3 {
    public static void main(String[] args) {
        int length = 20;
        int width = 8;

        int zc = getPerimeter(length, width);
        System.out.println("长方形周长：" + zc);

        int area = getArea(length, width);
        System.out.println("长方形面积：" + area);

    }

    // 获得周长
    public static int getPerimeter(int length, int width) {
        return (length + width) * 2;
    }

    // 获得面积
    public static int getArea(int length, int width) {
        return length * width;
    }

}
