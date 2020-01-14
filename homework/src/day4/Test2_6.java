package day4;

public class Test2_6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};

        // 默认数组为对称
        boolean flag = true;

        for(int i = 0; i < arr.length / 2; i++) {
            if(arr[i] != arr[arr.length - 1 - i]) {
                flag = false;
                break;
            }
        }

        // 输出结果
        System.out.print("[ ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if(i <= arr.length - 2) {
                System.out.print(", ");
            }
        }
        System.out.println(" ] 是否对称：" + flag);

    }
}
