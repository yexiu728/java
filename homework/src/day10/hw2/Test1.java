package day10.hw2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws ParseException {
        System.out.print("请输入你的生日(格式如 2010-10-20)：");
        Scanner sc = new Scanner(System.in);
        String birthday = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birthday);

        long time = System.currentTimeMillis() - date.getTime();

        if(time <= 0) {
            System.out.println("你还没有出生却已经活在了这个世界！");
            return;
        }

        long day = time / 1000 / 60 / 60 / 24;

        System.out.println("你已经在这个世界度过了 " + day + " 天");

    }
}
