package day21_exam.exam;

// 1.利用递归求5！
public class Test1 {

    public static void main(String[] args) {
        System.out.println(demo(5));

    }

    public static int demo(int num) {
        if (num <= 1) {
            return 1;
        }

        return num * demo(num - 1);
    }
}
