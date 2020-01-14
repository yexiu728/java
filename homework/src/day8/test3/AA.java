package day8.test3;

public interface AA {
    public abstract void showA();

    public default void showB10() {
        show10("BBBB");
    }

    public default void showC10() {
        show10("CCCC");
    }

    public default void show10(String str) {
        for (int i = 0; i < 10; i++) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
