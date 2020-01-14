package day14;

public class Test0 {
    /*

Test1：
    线程
        Thread类常用方法
            public Thread() :分配一个新的线程对象。
            public Thread(String name) :分配一个指定名字的新的线程对象。
            public Thread(Runnable target) :分配一个带有指定目标新的线程对象。
            public Thread(Runnable target,String name) :分配一个带有指定目标新的线程对象并指定名字。

            public String getName()
                获取当前线程名称。
            public void start()
                导致此线程开始执行; Java虚拟机调用此线程的run方法。
            public void run()
                此线程要执行的任务在此处定义代码。
            public static void sleep(long millis)
                使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）。
            public static Thread currentThread()
                返回对当前正在执行的线程对象的引用。

        创建线程方式
            继承Thread类
                public class MyThread extends Thread {
                    @Override
                    public void run() {
                    }
                }
                new MyThread().start();

            实现Runnable接口
                public class MyRunnable implements Runnable {
                    @Override
                    public void run() {
                    }
                }
                new Thread(new MyRunnable()).start();

                new Thread(() -> {
                    System.out.println("lambda方式");
                }).start;

                Thread t3 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("匿名内部类方式");
                    }
                }).start();

Test2：
        线程的睡眠
            public static void sleep(long millis)
                让当前线程睡眠指定的毫秒数

        线程加入
            public final void join()
                让线程在此线程优先执行,直至此线程执行完毕时,再执行当前线程
            public final void join(long millis)
                让此线程执行millis毫秒,再执行其他线程

        守护线程
            不管开启多少个线程(用户线程),守护线程总是随着第一个用户线程的停止而停止
                public final void setDaemon(boolean on)
                    设置线程是否为守护线程

        线程优先级
            public final void setPriority(int newPriority)
                设置线程的优先级，线程优先级默认为5 最高为10 最低为1
                如果不在这个范围之内则会抛出.不合法参数异常 (IllegalArgumentException)

        线程礼让
            public static void yield()
                线程礼让，告知当前线程可以将执行权礼让给其他线程，
                礼让给优先级相对高一点的线程，
                但仅仅是一种告知,并不是强制将执行权转让给其他线程.
                也有可能下次的执行权还在原线程这里。

        线程等待 Object 方法
            wait 和notify 方法要在synchronized 同步块中执行，且需要使用锁对象调用
            public void wait()
                导致当前线程等待，直到另一个线程调用该对象的 notify()方法或 notifyAll()方法
            void wait(long timeout)
                导致当前线程等待，直到另一个线程调用 notify()方法或该对象的 notifyAll()方法，或者指定的时间已过。
            public void notify()
                唤醒正在等待对象监视器的单个线程
            public void notifyAll()
                唤醒正在等待对象监视器的所有线程

            调用wait和notify方法需要注意的细节
                1. wait方法与notify方法必须要由同一个锁对象调用。
                    因为：对应的锁对象可以通过notify唤醒使用同一个锁对象调用的wait方法后的线程。
                2. wait方法与notify方法是属于Object类的方法的。
                    因为：锁对象可以是任意对象，而任意对象的所属类都是继承了Object类的。
                3. wait方法与notify方法必须要在synchronized 同步代码块或者是同步函数中使用。
                    因为：必须要通过锁对象调用这2个方法。

            wait 和sleep 的区别：
                wait 会释放锁，sleep 不会释放锁
                sleep会在指定时间醒来，wait在不传参数的情况下不会自动醒


Test4：
        同步
            同步代码块：
            synchronized 关键字可以用于方法中的某个区块中，表示只对这个区块的资源实行互斥访问。
                synchronized(同步锁){
                    需要同步操作的代码
                }
            同步方法
                使用synchronized修饰的方法,就叫做同步方法,保证A线程执行该方法的时候,其他线程只能在方法外等着
                    public synchronized void method(){
                        可能会产生线程安全问题的代码
                    }

        锁
            java.util.concurrent.locks.Lock
                机制提供了比synchronized代码块和synchronized方法更广泛的锁定操作,
                同步代码块/同步方法具有的功能Lock都有,除此之外更强大,更体现面向对象。
            Lock锁也称同步锁，加锁与释放锁方法化了，如下：
                public void lock() :加同步锁。
                public void unlock() :释放同步锁。

                    //创建锁对象
                    ReentrantLock lock = new ReentrantLock();
                    //开启锁
                    lock.lock();
                    //释放锁
                    lock.unlock();

Test4：
    线程状态：
        NEW(新建)
        Runnable(可运行)
        Blocked(锁阻塞)
        Waiting(无限等待)
        TimedWaiting(计时等待)
        Terminated(被终止)

*/
}
