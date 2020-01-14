package day4;

public class Test2_1 {
    public static void main(String[] args) {

        // 获得数组的最小值
        int[] arr = {12, 33, 25, 6, 16};
        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("数组最小值为：" + min);

    }

}
