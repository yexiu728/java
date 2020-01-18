package day20.test4;

import java.lang.reflect.Method;

public class Test4 {
    public static void main(String[] args) throws Exception {
        Class clazz = A.class;
        A a = (A) clazz.newInstance();
        Method method = clazz.getMethod("show");
        method.invoke(a);
    }
}
