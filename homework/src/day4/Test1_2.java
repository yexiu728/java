package day4;

public class Test1_2 {
    public static void main(String[] args) {
        int a = getSum(20);
        System.out.println("总和为：" + a);
    }
    public static int getSum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
