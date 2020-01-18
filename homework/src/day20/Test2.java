package day20;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> list = new ArrayList();

        Class clazz = list.getClass();

        Method add = clazz.getDeclaredMethod("add", Object.class);
        add.invoke(list, "hello");
        add.invoke(list, "你好");
        add.invoke(list, "how are you");

        System.out.println(list);

    }
}
