package day3;

public class Test7 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i <= 60; i++) {
            if(i % 2 == 0) {
                System.out.print(i + "  ");
                count++;
            }

            if(count == 5) {
                System.out.println();
                count = 0;
            }
        }
    }
}
