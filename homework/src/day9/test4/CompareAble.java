package day9.test4;

public interface CompareAble {

    public default Apple compare(Apple a, Apple b) {
        return a.getSize() > b.getSize() ? a : b;
    }
}
