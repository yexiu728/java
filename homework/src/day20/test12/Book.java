package day20.test12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface Book {
    String value();
    double price();
    String[] authors();
}
