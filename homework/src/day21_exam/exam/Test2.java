package day21_exam.exam;

import java.util.HashMap;
import java.util.Set;

/*
2、有如下字符串: abcdesldfsldflsadlsf ,统计出该字符串中每个字符的数量.
开发提示：list,set,map集合
打印要求：
字符：a，数量：5
字符：b，数量：5
*/
public class Test2 {

    public static void main(String[] args) {
        String text = "abcdesldfsldflsadlsf";
        HashMap<Character, Integer> map = new HashMap<>();

        // 统计
        getCharNum(map, text);

        // 打印
        Set<Character> keySet = map.keySet();
        for (char c : keySet) {
            System.out.println("字符：" + c + ", 数量：" + map.get(c));
        }
    }

    public static void getCharNum(HashMap<Character, Integer> map, String text) {
        char[] chars = text.toCharArray();

        for (char c : chars) {
            // 已存在map中
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, count + 1);
            } else {
                // 没有存在map中
                map.put(c, 1);
            }
        }
    }

}
