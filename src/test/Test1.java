package test;

public interface Test1 {

    public default void show() {
        System.out.println();
        final int a;
        a = 100;
    }
}
