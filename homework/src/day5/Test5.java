package day5;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {

        Student s1 = new Student("it001", "黄渤", 1.72);
        Student s2 = new Student("it002", "孙红雷", 1.78);
        Student s3 = new Student("it003", "章子怡", 1.64);
        Student s4 = new Student("it004", "杨颖", 1.68);

        ArrayList<Student> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);

        System.out.println("集合大小：" + 4);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).getId() + ", " + arr.get(i).getName() + ", " + arr.get(i).getHeight());
        }

        System.out.println("-------------------");

        System.out.println("身高1.70 以上的学员：");
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getHeight() >= 1.70) {
                System.out.println(arr.get(i).getId() + ", " + arr.get(i).getName() + ", " + arr.get(i).getHeight());
            }
        }

    }
}
