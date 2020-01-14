package day11.part1.test7;

public class Test7 {
    public static void main(String[] args) {

        Imple01 i1 = new Imple01();
        i1.show("你好");

        Imple02<Integer> i2 = new Imple02<>();
        i2.show(Integer.valueOf(123));

    }
}
