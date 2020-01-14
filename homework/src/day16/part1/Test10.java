package day16.part1;

public class Test10 {
    public static void main(String[] args) {
        int i = jieCheng(5);
        System.out.println(i);
    }

    public static int jieCheng(int num) {
        if (num <= 1) {
            return num;
        }
        return num * jieCheng(--num);
    }
}
