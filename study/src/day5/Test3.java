package day5;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("零");
        arrayList.add("一");
        arrayList.add("二");
        arrayList.add("三");
        arrayList.remove(0);
        arrayList.set(0, "新");
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.size());

        for(int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
