package day20;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Properties;
import java.util.Set;

public class Test4 {
    @Test
    public void demo1() throws Exception {
        Properties properties = new Properties();
        properties.load(Test4.class.getResourceAsStream("People.properties"));
        Set<String> set = properties.stringPropertyNames();

        Class clazz = People.class;
        People people = (People) clazz.newInstance();

        for (String s : set) {
            Field f = clazz.getDeclaredField(s);
            f.setAccessible(true);
            Class<?> type = f.getType();
            if (type == int.class) {
                f.set(people, Integer.parseInt(properties.getProperty(s)));
            } else if (type == String.class) {
                f.set(people, properties.getProperty(s));
            }
        }

        System.out.println(people);

    }
}
