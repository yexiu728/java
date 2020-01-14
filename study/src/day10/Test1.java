package day10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {

    public static void main(String[] args) {
        StringBuffer sBuffer = new StringBuffer();
        StringBuilder sBuilder = new StringBuilder();
        int num = 100000;

        long buffStart = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            sBuffer.append("a");
        }
        long buffEnd = System.currentTimeMillis();

        long buildStart = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            sBuilder.append("b");
        }
        long buildEnd = System.currentTimeMillis();

        System.out.println("StringBuffer：" + (buffEnd - buffStart));
        System.out.println("StringBuilder：" + (buildEnd - buildStart));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String date = sdf.format(new Date());
        System.out.println(date);



    }

}
