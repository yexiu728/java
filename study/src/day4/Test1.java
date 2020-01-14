package day4;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2};
        printArr(arr);
        reverse(arr);
        printArr(arr);
    }

    // 反转数组
    public static void reverse(int[] arr) {
        for(int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    // 打印数组
    public static void printArr(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i <= arr.length - 2) {
                System.out.print(", ");
            } else {
                System.out.print(" ]");
            }
        }
        System.out.println();
    }
}
