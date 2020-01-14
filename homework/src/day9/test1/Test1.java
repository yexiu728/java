package day9.test1;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        new HandleAble() {
            @Override
            public void handleString(String str) {
                System.out.println("原数字：" + str);

                int index = str.indexOf(".");

                if(index < 0) {
                    return;
                }

                int i = 4;

                String zhengShu = str.substring(0, index);
                System.out.println("取整后：" + zhengShu);

                String xiaoShu = null;

                char c = str.charAt(index + i + 1);
                if(c >= '5') {
                    char temp = (char) (str.charAt(index + i) + 1);
                    xiaoShu = str.substring(0, index + i) + temp;
                } else {
                    xiaoShu = str.substring(0, index + i + 1);
                }


                System.out.println("保留4 位小数后：" + xiaoShu);
            }
        }.handleString("23.23456789");

    }
}
