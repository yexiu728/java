package day11;

import java.io.FileNotFoundException;

public class Test2 {

    public static void main(String[] args) {
        Test<String> test = new Test<>("007");
        test.show(test.getId());
    }
}

class Test<E> {

    private E id;

    public Test() {
    }

    public Test(E id) {
        this.id = id;
    }

    public void show(E e) {
        System.out.println(e);
    }

    public E getId() {
        return id;
    }

    public void setId(E id) {
        this.id = id;
    }
}
