package day12.part1;

import java.util.LinkedList;

public class Test3 {
    /*

LinkedList基本使用

public void add(int index, E element)
    将指定的元素，添加到该集合中的指定位置上。
public E set(int index, E element)
    用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
public E get(int index)
    返回集合中指定位置的元素。
public E remove(int index)
    移除列表中指定位置的元素, 返回的是被移除的元素。
public void clear()
    从列表中删除所有元素。
public int size()
    返回此列表中的元素数。

*/

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println("列表长度为：" + list.size());
        System.out.println("列表内容为：" + list);

        list.set(0, "王子");
        System.out.println("索引0 位置的元素为：" + list.get(0));

        list.remove(2);
        System.out.println("列表内容为：" + list);

        list.clear();

        System.out.println("清空后的列表为：" + list);

    }

}
