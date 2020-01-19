package day21_exam.exam;

/*
3、 有100个限量版的水杯，但是只能通过实体店和官网才能进行购买,
请用线程进行模拟并设置线程名称用来代表售出途径，再将信息打印出来.
打印要求：售出途径：实体店，卖出第1个，剩余99个
售出途径：官网，卖出第2个，剩余98个
*/
public class Test3 {
    public static void main(String[] args) {
        MyRunnable run = new MyRunnable();
        Thread t1 = new Thread(run, "实体店");
        Thread t2 = new Thread(run, "官网");
        t1.start();
        t2.start();
    }
}

class MyRunnable implements Runnable {

    // 水杯数量：100
    int num = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (num <= 0) {
                    break;
                }
                // 卖出
                num--;
                System.out.println("售出途径：" + Thread.currentThread().getName() + ", 卖出第" + ( 100 - num) + "个, 剩余" + num + "个");

            }
        }
    }
}
