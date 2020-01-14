package day9.test5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(1);

        List<Integer> result = list.stream().sorted((a, b) -> {
            return b -a;
        }).collect(Collectors.toList());
        result.stream().forEach(System.out::print);

        System.out.println();

        list.stream().sorted((a, b) -> {
            return b - a;
        }).limit(3).forEach(n -> {
            System.out.print(n + "  ");
        });
    }
}
