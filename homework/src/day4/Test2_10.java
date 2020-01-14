package day4;

public class Test2_10 {
    public static void main(String[] args) {
        int[] arr = {99, 100, 98, 97, 96};

        int max = arr[0];
        int min = arr[0];
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
            count += arr[i];
        }

        int result = (count - min - max) / (arr.length - 2);
        System.out.println("最终得分：" + result);
    }
}
