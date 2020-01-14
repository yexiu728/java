package test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        System.out.print(cal.get(Calendar.YEAR) + "年" + cal.get(Calendar.MONTH) + "月" + cal.get(Calendar.DAY_OF_MONTH) + "日"); // 2020年1月17日
        System.out.println();

        Date date = new Date();
        long time = date.getTime();

        System.out.println(new Integer(123) == new Integer(123));

    }
}
