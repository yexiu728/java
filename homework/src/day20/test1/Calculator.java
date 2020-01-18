package day20.test1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Calculator {

    Calculator c;
    int a;
    int b;

    @Before
    public void init() {
        c = new Calculator();
        c.a = 10;
        c.b = 20;
    }

    @Test
    public void jia() {
        System.out.println(c.a + " + " + c.b + " = " + (c.a + c.b));
    }

    @Test
    public void jian() {
        System.out.println(c.a + " - " + c.b + " = " + (c.a - c.b));
    }

    @Test
    public void cheng() {
        System.out.println(c.a + " * " + c.b + " = " + (c.a * c.b));
    }

    @Test
    public void chu() {
        if (c.b == 0) {
            System.out.println("除数不能为0");
            return;
        }
        System.out.println(c.a + " / " + c.b + " = " + ((double) c.a / c.b));
    }

    @After
    public void end() {
        c = null;
    }
}
