package day16.part1;

public class Test9 {
    public static void main(String[] args) {
        int sum = sum(100);
        System.out.println(sum);
    }

    public static int sum(int num) {
        if(num <= 0) {
            return num;
        }
        return num + sum(--num);
    }
}
