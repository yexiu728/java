package day12.part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Test9 {
    public static void main(String[] args) {
        // array1 = "a","b","a","c","d",array2= "e","f","a","d","g",
        ArrayList<String> array1 = new ArrayList<>();
        ArrayList<String> array2 =  new ArrayList<>();

        Collections.addAll(array1, "a","b","a","c","d");
        Collections.addAll(array2, "e","f","a","d","g");

        HashSet<String> set = new HashSet<>();
        set.addAll(array1);
        set.addAll(array2);

        System.out.println(set);

    }
}
