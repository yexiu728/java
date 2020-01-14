package day15.test1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 多窗口卖票
public class Test1 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(200);
        Seller seller = new Seller(ticket);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    boolean have = seller.sell();
                    if (!have) {
                        break;
                    }
                }
            }
        }, "广州东");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    boolean have = seller.sell();
                    if (!have) {
                        break;
                    }
                }
            }
        }, "北京");

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    boolean have = seller.sell();
                    if (!have) {
                        break;
                    }
                }
            }
        }, "深圳北");

        t1.start();
        t2.start();
        t3.start();
    }

}

