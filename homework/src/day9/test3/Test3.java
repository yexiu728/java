package day9.test3;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            users.add(new User(i + 1, null));
        }

        System.out.println("未分组：" + users);

        JieDai jieDai1 = new JieDai((User user) -> {
            int id = user.getId();
            if (id >= 10 && id <= 19) {
                user.setType("v1");
            }
        });

        JieDai jieDai2 = new JieDai((User user) -> {
            int id = user.getId();
            if (id >= 20 && id <= 29) {
                user.setType("v2");
            }
        });

        JieDai jieDai3 = new JieDai((User user) -> {
            String type = user.getType();
            if (type == null) {
                user.setType("A");
            }
        });

        // 接待所有user
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);

            jieDai1.jieDai(user);
            jieDai2.jieDai(user);
             jieDai3.jieDai(user);
        }

        // 输出

        System.out.println("已分组：");
        for (int i = 0; i < users.size(); i++) {
            if (i % 9 == 0) {
                System.out.println();
            }
            User user = users.get(i);
            System.out.print(user + "  ");
        }

    }
}
