package day6;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        /*String str1 = "hallo";
        String str2 = new String();
        String str3 = new String("hello");
        String str4 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        String str5 = new String(new byte[]{12, 2, 3, 4});
        String str6 = new String(str4.getBytes(), 2, 2);*/

        // System.out.println(str6);
        User user1 = new User("马云", 56, 2500.0);
        User user2 = new User("马化腾", 56, 2400.0);
        User user3 = new User("马赛克", 56, 2500.0);

        ArrayList<User> uList = new ArrayList<>();
        uList.add(user1);
        uList.add(user2);
        uList.add(user3);

        splitUser(uList);

    }

    public static void splitUser(ArrayList<User> uList) {

        String users = uList.toString();
        System.out.println(users);

        ArrayList<String> names = new ArrayList<>();

        users = users.replace("[", "");
        users = users.replace("]", "");

        // System.out.println(users);

        String[] user = users.split("User\\{name="); // 索引为0 处为空串 ""

        // 从1 开始过滤掉0 位置的空串 ""
        for (int i = 1; i < user.length; i++) {
            String[] arr = user[i].split(",");
            names.add(arr[0]);
        }

        // 遍历输出
        for (String name : names) {
            System.out.println(name);
        }
    }
}
