package day11.part1;

public class Test6 {
    public static void main(String[] args) {

        function("你好");
        function(123);
    }

    public static <T> void function(T t) {
        System.out.println(t);
    }
}
