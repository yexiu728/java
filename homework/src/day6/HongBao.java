package day6;

import java.util.ArrayList;
import java.util.Random;

// 发红包：二倍均值法
public class HongBao {
    public static void main(String[] args) {
        fhb(10, 5);
    }

    public static void fhb(int money, int num) {
        Random ran = new Random();

        ArrayList<Integer> hb = new ArrayList<>();
        for (int i = 0; i < num - 1; i++) {
            int a = ran.nextInt(money / (num - i) * 2 - 1) + 1;
            hb.add(a);
            money -= a;
        }
        hb.add(money);

        System.out.println(hb);

        int count = 0;
        int max = hb.get(0);
        for (int i = 0; i < hb.size(); i++) {
            count += hb.get(i);
            if(hb.get(i) > max) {
                max = hb.get(i);
            }
        }
        System.out.println("金额总计：" + count + ", 个数：" + hb.size() + ", 最大：" + max);

    }
}
