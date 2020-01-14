package day3;

public class Test9 {
    public static void main(String[] args) {
        int row = 7;
        for(int i = 1; i <= row; i++) {

            for(int j = 1; j <= row; j++) {
                if(j == i || j == (row + 1 - i)) {
                    System.out.print("⚪");
                } else {
                    System.out.print(" * ");
                }
            }

            System.out.println();
        }
    }
}
