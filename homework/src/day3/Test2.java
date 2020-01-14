package day3;

public class Test2 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 1) {
                sum += i;
            }
        }

        System.out.println("1-100 的奇数累加和：" + sum);
    }
}
