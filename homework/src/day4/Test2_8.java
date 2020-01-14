package day4;

public class Test2_8 {
    public static void main(String[] args) {

        int[] xiaoming = {'D', 'C', 'B', 'A', 'D'};
        int[] xiaohong = {'A', 'D', 'B', 'C', 'D'};
        int[] xiaohuang = {'A', 'D', 'B', 'C', 'A'};
        int[] xiaoqiang = {'A', 'B', 'C', 'D', 'D'};

        printScore("小明", xiaoming);
        printScore("小红", xiaohong);
        printScore("小黄", xiaohuang);
        printScore("小强", xiaoqiang);

    }

    // 判断分数，每题默认2 分
    public static void printScore(String name, int[] answer) {
        // 答案
        int[] result = {'A', 'D', 'B', 'C', 'D'};
        // 得分
        int score = 0;

        for(int i = 0; i < result.length; i++) {
            if(result[i] == answer[i]) {
                score += 2;
            }
        }

        System.out.println("满分10 分，" + name + "：得分：" + score + " 分");
    }
}
