package day5;

import java.util.ArrayList;

// 获得集合中排名前三的数据
public class Test9_2 {
    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("马云", 4000));
        list.add(new Person("马化腾", 1500));
        list.add(new Person("雷军", 3800));
        list.add(new Person("王健林", 3500));
        list.add(new Person("任正非", 3200));
        list.add(new Person("刘强东", 5600));
        list.add(new Person("李彦宏", 3000));

        ArrayList<Person> resultList = new ArrayList<>();
        resultList.add(list.get(0));
        resultList.add(list.get(1));
        resultList.add(list.get(2));
        listSort(resultList);

        for(int i = 3; i < list.size(); i++) {
            Person p = list.get(i);
            for(int j = 0; j < resultList.size(); j++) {
                // System.out.println(p.getName() + ", " + p.getSalary() + " -- " + resultList.get(j).getName() + ", " + resultList.get(j).getSalary());
                if(p.getSalary() > resultList.get(j).getSalary()) {
                    Person temp = p;
                    p = resultList.get(j);
                    resultList.set(j, temp);
                }
            }
        }

        System.out.println("===== 结果 =====");
        printList(resultList);

        System.out.println("===== 分割线 =====");
        listSort(list);
        printList(list);

    }

    // 冒泡排序
    public static void listSort(ArrayList<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if(list.get(j).getSalary() < list.get(j + 1).getSalary()) {
                    Person p = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, p);
                }
            }
        }
    }

    // 遍历并打印集合数据
    public static void printList(ArrayList<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).show();
        }
    }
}
