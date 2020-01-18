package day20.test6;

import java.lang.reflect.Field;

public class Test6 {
    public static void main(String[] args) {
        Test6 t = new Test6();
        Demo demo = new Demo();
        t.setProperty(demo, "data", "hello");
        System.out.println(t.getProperty(demo, "data"));
    }

    // 写一个方法，此方法可将obj对象中名为propertyName的属性的值设置为value.
    public void setProperty(Object obj, String propertyName, Object value){
        Class clazz = obj.getClass();
        try {
            Field field = clazz.getDeclaredField(propertyName);
            field.setAccessible(true);
            field.set(obj, value);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // 写一个方法，此方法可以获取obj对象中名为propertyName的属性的值
    public Object getProperty(Object obj, String propertyName){
        Class clazz = obj.getClass();
        Object o = null;
        try {
            Field field = clazz.getDeclaredField(propertyName);
            field.setAccessible(true);
            o = field.get(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }
}
