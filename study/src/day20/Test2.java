package day20;

import java.lang.reflect.Constructor;

public class Test2 {
    public static void main(String[] args) {

        Class clazz = null;
        try {
            clazz = Class.forName("day20.People");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (clazz == null) {
            return;
        }

        Constructor[] cons = clazz.getDeclaredConstructors();
        for (Constructor c : cons) {
            System.out.println(c);
        }

        System.out.println("==========");

        try {

            Constructor<People> c = clazz.getDeclaredConstructor(String.class);
            c.setAccessible(true); // 暴力反射
            System.out.println(c);

            People p = c.newInstance("大王"); // 如果没有暴力反射，会报错
            System.out.println(p);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

