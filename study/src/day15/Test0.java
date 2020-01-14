package day15;

public class Test0 {
    /*

Test1：
    线程死锁问题
        多线程同步的时候, 如果同步代码嵌套, 使用相同锁, 就有可能出现死锁

Test2：
    wait 与notify 使用

Test3：
    wait 与notify 通信

Test4：
    监视器 Condition 通信
        Condition c = new ReentrantLock().newCondition();
        c.await(); // 等待
        c.signal() // 唤醒

Test5：
    Callable 接口（了解）
        V call() throws Exception;
            调用方法

            MyCall myCall = new MyCall();
            FutureTask<Object> task = new FutureTask<>(myCall);
            new Thread(task).start();

作业：
    多窗口卖票
    卖包子

*/
}
