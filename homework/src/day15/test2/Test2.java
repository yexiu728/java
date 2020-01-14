package day15.test2;

// 卖包子
public class Test2 {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi(0);
        Producer producer = new Producer(baoZi);
        Customer customer = new Customer(baoZi);

        new Thread(producer, "小二").start();
        new Thread(customer, "猪八戒").start();
    }
}
