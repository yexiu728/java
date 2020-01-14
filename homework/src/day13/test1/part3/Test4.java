package day13.test1.part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Test4 {
    public static void main(String[] args) {
        new Test4();
    }

    HashMap<Integer, String> card = new HashMap<>();
    ArrayList<String> player1 = new ArrayList<>();
    ArrayList<String> player2 = new ArrayList<>();
    ArrayList<String> player3 = new ArrayList<>();
    ArrayList<String> diPai = new ArrayList<>();

    public Test4() {
        getCard();
        sendCard();
        System.out.println(card.size() + "：" + card);
        System.out.println(player1.size() + "：" + player1);
        System.out.println(player2.size() + "：" + player2);
        System.out.println(player3.size() + "：" + player3);
        System.out.println(diPai.size() + "：" + diPai);
    }

    // 发牌
    public void sendCard() {
        ArrayList<Integer> nums = new ArrayList<>(card.keySet());
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        ArrayList<Integer> num3 = new ArrayList<>();
        ArrayList<Integer> numElse = new ArrayList<>();


        // 打乱顺序
        Collections.shuffle(nums);

        // 分发序号
        for (int i = 0; i < card.size(); i++) {
            if (i < card.size() - 3) {
                if (i % 3 == 0) {
                    num1.add(nums.get(i));
                }
                if (i % 3 == 1) {
                    num2.add(nums.get(i));
                }
                if (i % 3 == 2) {
                    num3.add(nums.get(i));
                }
            } else {
                numElse.add(nums.get(i));
            }
        }
        // 排序
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        // 排序
        num1.sort(com);
        num2.sort(com);
        num3.sort(com);
        numElse.sort(com);

        // 发牌
        sendTo(player1, num1);
        sendTo(player2, num2);
        sendTo(player3, num3);
        sendTo(diPai, numElse);

    }

    private void sendTo(ArrayList<String> player, ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            player.add(card.get(nums.get(i)));
        }
    }

    // 获得整副牌
    public void getCard() {

        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(colors, "♦", "♣", "♥", "♠");

        ArrayList<String> fonts = new ArrayList<>();
        for (int i = 3; i <= 10; i++) {
            fonts.add(String.valueOf(i));
        }
        Collections.addAll(fonts, "A", "2", "J", "Q", "K");

        int count = 0;
        for (int i = 0; i < fonts.size(); i++) {
            for (int j = 0; j < colors.size(); j++) {
                card.put(++count, colors.get(j) + fonts.get(i));
            }
        }

        card.put(++count, "小🃏");
        card.put(++count, "大🃏");

    }
}
