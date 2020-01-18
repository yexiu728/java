package day20.test8;

import java.util.Properties;
import java.util.Set;

public class Test8 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(Test8.class.getResourceAsStream("/day20/test8/Properties.properties"));

        String className = properties.getProperty("className");

        Class clazz = Class.forName(className);
        DemoClass demo = (DemoClass) clazz.newInstance();
        demo.run();

    }
}
