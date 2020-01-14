package day11.part2;

public class Test4 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e"};
        swap(arr, 1, 3);

        System.out.println("==========");

        Integer[] arr2 = {1, 2, 3, 4, 5};
        swap(arr2, 1, 2);

    }

    public static <E> void swap(E[] arr, int a, int b) {
        if(a >= arr.length || b >= arr.length) {
            return;
        }

        System.out.println("交换前的元素：" + arr[a] + ", " + arr[b]);

        E temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        System.out.println("交换后的元素：" + arr[a] + ", " + arr[b]);
    }

}
