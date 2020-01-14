package day4;

public class Test2_7 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};

        printArray(arr1);
        printArray(arr2);

        System.out.println("是否一致：" + equals(arr1, arr2));
    }

    // 打印数组
    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for(int i = 0; i< arr.length; i++) {
            System.out.print(arr[i]);
            if(i <= arr.length - 2) {
                System.out.print("，");
            }
        }
        System.out.println(" ]");
    }

    // 判断长度是否相同
    public static boolean equals(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) {
            return false;
        }
        // 判断内容是否相同
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
