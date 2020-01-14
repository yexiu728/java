package day5;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("姚小明", 23, "打篮球");
        Teacher t2 = new Teacher("景甜", 20, "打羽毛球");
        Teacher t3 = new Teacher("薛之谦", 45, "踢足球");

        ArrayList<Teacher> list = new ArrayList<>();
        list.add(t1);
        list.add(t2);
        list.add(t3);

        for (int i = 0; i < list.size(); i++) {
            list.get(i).show();
        }

        System.out.println("--------------------");

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getAge() > 40) {
                list.get(i).setLike("打高尔夫");
                list.get(i).show();
            }
        }
    }
}
