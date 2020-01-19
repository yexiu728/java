package day20.test6;

import java.lang.reflect.Method;

// 自定义单元测试
public class Test6 {
    public static void main(String[] args) throws Exception {
        Class clazz = Demo.class;
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(MyTest.class)) {
                m.invoke(clazz.newInstance());
            }
        }
    }
}
