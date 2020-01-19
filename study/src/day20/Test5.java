package day20;


import java.lang.annotation.*;
import java.lang.reflect.Method;

public class Test5 {
    public static void main(String[] args) throws NoSuchMethodException {

        Method method = Demo.class.getMethod("demo1");
        boolean b = method.isAnnotationPresent(MyInter.class);
        System.out.println(b);
        if (b) {
            Annotation[] annotations = method.getDeclaredAnnotations();
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

abstract class A {
    public abstract void a();
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyInter {
    String name();
}
