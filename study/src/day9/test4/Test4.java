package day9.test4;

import java.util.Arrays;
import java.util.Comparator;

public class Test4 {
    public static void main(String[] args) {

        // 最简单lambda 表达式
        sum(2, 5, (int a, int b) -> {
            return a + b;
        });

        // 匿名内部类形式
        Integer[] arr = new Integer[]{1, 3, 5, 2, 4};
        Arrays.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        // 输出结果
        printArray(arr);

        // 应用lambda 表达式
        arr = new Integer[]{6, 5, 9, 7, 8};
        Arrays.sort(arr, (Integer a, Integer b) -> {
            return b - a;
        });
        // 输出结果
        printArray(arr);

    }

    // 求和
    public static void sum(int a, int b, MathSum mathSum) {
        System.out.println(mathSum.getSum(a, b));
    }

    // 打印数组
    public static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

}

interface MathSum {
    public abstract int getSum(int a, int b);
}


