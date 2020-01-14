package day7.test7;

public class Test7 {
    public static void main(String[] args) {
        Message message = new Message("m110", "老王", 10000.0D);
        message.eat();
        message.work();

        Chef chef = new Chef("c110", "小王", 6000.0D);
        chef.eat();
        chef.work();
    }
}
