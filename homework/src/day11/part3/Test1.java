package day11.part3;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        // 纸牌
        ArrayList<String> card = new ArrayList<>();
        // 字面值
        ArrayList<String> num = new ArrayList<>();
        // 花色
        ArrayList<String> flower = new ArrayList<>();

        num.add("A");
        num.add("J");
        num.add("Q");
        num.add("K");

        for (int i = 2; i <= 10; i++) {
            num.add(String.valueOf(i));
        }

        flower.add("♥");
        flower.add("♠");
        flower.add("♣");
        flower.add("♦");

        // 生成整副牌
        for (int i = 0; i < num.size(); i++) {
            for (int j = 0; j < flower.size(); j++) {
                card.add(flower.get(j) + num.get(i));
            }
        }
        // 添加大王和小王
        card.add("小🃏");
        card.add("大🃏");

        // 洗牌
        Collections.shuffle(card);

        // 玩家
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        // 地主
        ArrayList<String> diPai = new ArrayList<>();
        ArrayList<String> diZhu = new ArrayList<>();

        for (int i = 0; i < card.size(); i++) {
            if (i < card.size() - 3) {
                if (i % 3 == 0) {
                    if("大🃏".equals(card.get(i))) {
                        diZhu = player1;
                    }
                    player1.add(card.get(i));

                } else if (i % 3 == 1) {
                    if("大🃏".equals(card.get(i))) {
                        diZhu = player2;
                    }
                    player2.add(card.get(i));

                } else if (i % 3 == 2) {
                    if("大🃏".equals(card.get(i))) {
                        diZhu = player3;
                    }
                    player3.add(card.get(i));
                }
            } else {
                diZhu.add(card.get(i));
                diPai.add(card.get(i));
                // 如果大王在底牌
                if("大🃏".equals(card.get(i))) {
                    System.out.println("！大王在底牌！");
                    // 重新开始
                    // main(new String[]{});
                    // return;
                }
            }
        }

        System.out.println(card.size() + "张：" + card);
        System.out.println(player1.size() + "张：" + player1);
        System.out.println(player2.size() + "张：" + player2);
        System.out.println(player3.size() + "张：" + player3);
        System.out.println(diPai.size() + "张：" + diPai);

    }
}
