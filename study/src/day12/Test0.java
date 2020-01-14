package day12;

public class Test0 {
    /*

Test1：
    Collection：List、Set
    List：ArrayList、LinkedList  有序、可以重复

        public void add(int index, E element)
            将指定的元素，添加到该集合中的指定位置上。
        public E set(int index, E element)
            用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
        public E get(int index)
            返回集合中指定位置的元素。
        public E remove(int index)
            移除列表中指定位置的元素, 返回的是被移除的元素。
        public boolean contains(Object o)
            如果此列表包含指定的元素，则返回 true 。

        ArrayList
            增删慢，查找快
        LinkedList
            增删快，查找慢

            public void addFirst(E e) :将指定元素插入此列表的开头。
            public void addLast(E e) :将指定元素添加到此列表的结尾。
            public E getFirst() :返回此列表的第一个元素。
            public E getLast() :返回此列表的最后一个元素。
            public E removeFirst() :移除并返回此列表的第一个元素。
            public E removeLast() :移除并返回此列表的最后一个元素。

            public E pop() :从此列表所表示的堆栈处弹出一个元素。
            public void push(E e) :将元素推入此列表所表示的堆栈。
            public boolean isEmpty() ：如果列表不包含元素，则返回true。

    Set：HashSet、LinkedHashSet
        HashSet：无序，不能重复
        LinkedHashSet：有序，不能重复
        去重原理：先判断HashCode是否相同，如果相同，再比较equals

Test2：
    Collections
        是集合工具类，用来对集合进行操作。

        public static <T> boolean addAll(Collection<T> c, T... elements)
            往集合中添加一些元素。
        public static void shuffle(List<?> list)
            打乱顺序 :打乱集合顺序。
        public static <T> void sort(List<T> list)
            将集合中元素按照默认规则排序。
        public static <T> void sort(List<T> list，Comparator<? super T> )
            将集合中元素按照指定规则排序。
        Collections.reverse(list);
            反转集合内容

        排序
            Collections.sort(list);
            list.sort((a, b) -> {
                return b - a;
            });

Test4：
    实现Comparable 接口，再使用Collections 的sort(List<T> list) 方法，给自定义元素的集合排序

*/
}
