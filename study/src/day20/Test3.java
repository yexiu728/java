package day20;

import java.lang.reflect.Method;

public class Test3 {
    public static void main(String[] args) {
        Class<People> clazz = People.class;

        try {
            People people = clazz.newInstance();
            Method m = clazz.getDeclaredMethod("sleep");
            m.setAccessible(true);
            m.invoke(people);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

