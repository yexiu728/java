package day20;


import java.lang.annotation.*;
import java.lang.reflect.Method;

public class Test5 {
    public static void main(String[] args) throws NoSuchMethodException {
        Class clazz = Demo.class;

        Method method = Demo.class.getMethod("demo1");
        boolean b = method.isAnnotationPresent(MyInter.class);
        // System.out.println(b);
        if (b) { // true
            // Annotation[] annotations = method.getAnnotations();
            Annotation[] annotations = clazz.getAnnotations(); // 获得注解
            for (Annotation a : annotations) {
                System.out.println(a);
            }
            System.out.println("==========");

            MyInter myInter = method.getDeclaredAnnotation(MyInter.class);
            System.out.println(myInter.name());

        }

    }


}

@MyInter(name = "Demo")
class Demo extends A {
    @MyInter(name = "demo1")
    public void demo1() {
    }

    @Override
    public void a() {
    }
}

@MyInterB
class A {
    public void a() {
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyInter {
    String name();
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyInterB {
}