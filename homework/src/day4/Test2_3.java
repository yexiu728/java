package day4;

public class Test2_3 {
    public static void main(String[] args) {

        int[] nums = {5, 10, 15};
        int[] newArr = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            newArr[i] = nums[i] * 2;
        }

        System.out.println("nums原数组为：");
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "  ");
        }
        System.out.println();

        System.out.println("newArr新数组为：");
        for(int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "  ");
        }

    }
}
