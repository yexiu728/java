package day20.test7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Test7 {
    public static void main(String[] args) throws Exception {
        Class clazz = Person.class;
        Constructor constructor = clazz.getDeclaredConstructor(String.class, int.class);

        Person p = (Person) constructor.newInstance("张翼德", 30);

        System.out.println(p);

        Field field = clazz.getDeclaredField("age");
        field.setAccessible(true);
        field.set(p, 50);

        System.out.println(p);

    }
}
