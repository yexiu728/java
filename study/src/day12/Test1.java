package day12;

import java.util.HashSet;

public class Test1 {
    public static void main(String[] args) {
        HashSet<P> set = new HashSet<>();
        set.add(new P("王子"));
        set.add(new P("公主"));

        for (P p : set) {
            System.out.println(p.getName());
        }
    }
}
class P {
    private String name;

    public P() {
    }

    public P(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 10;
    }

}
