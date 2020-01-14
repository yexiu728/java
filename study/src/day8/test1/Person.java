package day8.test1;

public interface Person {
    // 抽象方法
    public abstract void eat();
    // 省略默认关键字之后的抽象方法
    void sleep();

    // 默认方法
    public default void work() {

    }

    // 静态方法
    public static void method() {

    }

}
