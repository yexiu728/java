package day20.test3;

import java.lang.reflect.Constructor;

public class Test3 {
    public static void main(String[] args) throws Exception {
        Class clazz = Student.class;
        Student s1 = (Student) clazz.newInstance();
        System.out.println(s1);

        Constructor constructor = clazz.getConstructor(String.class, int.class);
        Student s2 = (Student) constructor.newInstance("hello", 20);
        System.out.println(s2);

    }
}
