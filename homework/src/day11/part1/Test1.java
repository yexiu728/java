package day11.part1;

import java.util.ArrayList;
import java.util.Collection;

public class Test1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList();
        coll.add("马云");
        coll.add("马化腾");
        coll.add("马赛克");

        System.out.println(coll);
        coll.remove(((ArrayList<String>) coll).get(0));
        System.out.println(coll + ", " + coll.size());
        coll.clear();
        System.out.println(coll);

    }
}
