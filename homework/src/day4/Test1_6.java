package day4;

public class Test1_6 {
    public static void main(String[] args) {
        printX(10);
    }

    public static void printX(int line) {
        for(int i = 1; i <= line; i++) {
            for(int j = 1; j <= line; j++) {
                if(j == i || j == line + 1 -i) {
                    System.out.print("⭕");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
