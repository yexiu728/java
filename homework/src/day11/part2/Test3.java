package day11.part2;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("c");
        arr.add("a");
        arr.add("b");
        arr.add("b");
        arr.add("b");
        arr.add("a");

        System.out.println(frequency(arr, "a"));

    }

    public static int frequency(ArrayList<String> arr, String key) {
        int count = 0;

        for (String str : arr) {
            if(str.equals(key)) {
                count++;
            }
        }

        return count;
    }
}
