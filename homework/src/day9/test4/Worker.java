package day9.test4;

public class Worker {
    public Apple pickApple(CompareAble compareAble, Apple a1, Apple a2) {
        return compareAble.compare(a1, a2);
    }
}
