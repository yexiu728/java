package day5;

import java.util.ArrayList;

// 获得集合中排名前三的数据
public class Test9 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("马云", 40000));
        list.add(new Person("马化腾", 15000));
        list.add(new Person("雷军", 38000));
        list.add(new Person("王健林", 35000));
        list.add(new Person("任正非", 32000));
        list.add(new Person("刘强东", 16000));
        list.add(new Person("李彦宏", 30000));

        // 取出工资前三名，放入另外一个集合中遍历出来

        ArrayList<Person> resultList = new ArrayList<>();
        resultList.add(list.get(0));
        resultList.add(list.get(1));
        resultList.add(list.get(2));

        // 先给原先的三个数据由大到小排序
        listSort(resultList);

        // 输出原始内容
        /*System.out.println("==========");
        printList(resultList);*/

        // 判断新数据在当前排行中为第几，然后插入到该位置，并保持后面的数据更新
        for(int i = 3; i < list.size(); i++) {
            int salary = list.get(i).getSalary();
            // 第一的位置
            if(salary >= resultList.get(0).getSalary()) {
                // 插入到第一
                Person big = resultList.get(0);
                Person small = resultList.get(1);
                resultList.set(0, list.get(i));
                resultList.set(1, big);
                resultList.set(2, small);
            }
            // 第二的位置
            if(salary < resultList.get(0).getSalary() && salary >= resultList.get(1).getSalary()) {
                // 插入到第二
                Person p = resultList.get(1);
                resultList.set(1, list.get(i));
                resultList.set(2, p);
            }
            // 第三的位置
            if(salary < resultList.get(1).getSalary() && salary >= resultList.get(2).getSalary()) {
                // 插入到第三
                resultList.set(2, list.get(i));
            }
        }

        // 输出结果
        System.out.println("===== 前三 =====");
        printList(resultList);

        System.out.println("========== 华丽的分割线 ==========");
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
