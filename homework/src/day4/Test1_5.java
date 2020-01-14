package day4;

public class Test1_5 {
    public static void main(String[] args) {
        showColor("red");
    }

    public static void showColor(String color) {
        switch (color) {
            case "red":
                System.out.println(color + "是红色");
                break;
            case "green":
                System.out.println(color + "是绿色");
                break;
            case "blue":
                System.out.println(color + "是蓝色");
                break;
            default :
                System.out.println("颜色未知");
                break;
        }
    }
}
