package day14.test3;

public class Test3 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        Thread t1 = new Thread(ticket, "机场北");
        Thread t2 = new Thread(ticket, "机场南");
        Thread t3 = new Thread(ticket, "北京");

        t1.start();
        t2.start();
        t3.start();
    }
}
