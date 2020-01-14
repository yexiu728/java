package day10.hw1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的生日(格式如 2010-10-20)：");
        String str = sc.nextLine();
        Date date = df.parse(str);
        System.out.println(date);

    }
}
