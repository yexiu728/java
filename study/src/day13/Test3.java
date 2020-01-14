package day13;

public class Test3 {
    public static void main(String[] args) {
         demo1(1);

    }

    public static void demo1(int num) {
        try {
            System.out.println(1 / num);
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("yell");
        }

        System.out.println("hello");
    }

}
