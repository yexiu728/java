package day13.test1.part2;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Test8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        HashMap<String, Integer> map = new HashMap<>();

        while(map.size() < 5) {
            System.out.print("请输入一个名字：");
            String name = scan.nextLine();
            int score = ran.nextInt(101);
            map.put(name, score);
        }

        String name = map.keySet().iterator().next();
        int defaultScore = map.get(name);

        int count = 0;
        int max = defaultScore;
        int min = defaultScore;

        Set<String> keySet = map.keySet();
        for (String str : keySet) {
            int score = map.get(str);
            count += score;

            if(score > max) {
                max = score;
            }
            if(score < min) {
                min = score;
            }
        }

        double avg = (double)count / map.size();

        System.out.println(map);
        System.out.println("==========");

        System.out.println("总分 = " + count);
        System.out.println("平均分 = " + avg);
        System.out.println("最高分 = " + max);
        System.out.println("最低分 = " + min);

    }
}
