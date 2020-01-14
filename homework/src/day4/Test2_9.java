package day4;

public class Test2_9 {
    public static void main(String[] args) {
        String[] huaSe = {"黑桃", "红桃", "梅花", "方片"};
        String[] dianShu = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        // 纸牌
        String[] pai = new String[huaSe.length * dianShu.length];
        // 拼接
        for(int i = 0; i < huaSe.length; i++) {
            for(int j = 0; j < dianShu.length; j++) {
                pai[dianShu.length * i + j] = huaSe[i] + dianShu[j];
            }
        }

        // 打印结果
        for(int i = 0; i < pai.length; i++) {
            if(i % dianShu.length == 0) {
                System.out.println();
            }
            System.out.print(pai[i] + "  ");
        }

    }
}
