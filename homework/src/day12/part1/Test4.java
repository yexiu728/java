package day12.part1;

import java.util.LinkedList;

public class Test4 {
    /*

LinkedList特有方法

public void addFirst(E e) :将指定元素插入此列表的开头。
public void addLast(E e) :将指定元素添加到此列表的结尾。
public E getFirst() :返回此列表的第一个元素。
public E getLast() :返回此列表的最后一个元素。
public E removeFirst() :移除并返回此列表的第一个元素。
public E removeLast() :移除并返回此列表的最后一个元素。

*/

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("张三");
        list.addFirst("李四");
        list.addFirst("王五");
        list.addLast("赵六");
        System.out.println("集合内容为：" + list);

        System.out.println("第一个元素为：" + list.getFirst());
        System.out.println("最后一个元素为：" + list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println("集合最终为：" + list);
    }

}
