package day3;

public class Test1 {
    public static void main(String[] args) {
        printNum(10000);
    }

    public static void printNum(int n) {
        System.out.println("for 循环打印");
        for (int i = 0; i <= n; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();

        System.out.println("while 循环打印");
        int i = 0;
        while(i <= n) {
            System.out.print(i + "  ");
            i++;
        }
        System.out.println();

        System.out.println("do while 循环打印");
        i = 0;
        do {
            System.out.print(i + "  ");
            i++;
        } while(i <= n);
        System.out.println();
    }
}
