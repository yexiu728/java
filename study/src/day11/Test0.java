package day11;

public class Test0 {
    /*

Test1：
    Collection集合
        集合按照其存储结构可以分为两大类，分别是
        单列集合 java.util.Collection 和双列集合 java.util.Map

        Collection：List、Set
            List：ArrayList、LinkedList、Vector
            Set：HashSet、LinkedHashSet
        Collection 常用功能
            public boolean add(E e)
                把给定的对象添加到当前集合中。
            public boolean remove(E e)
                把给定的对象在当前集合中删除。
            public void clear()
                清空集合中所有的元素。
            public boolean contains(E e)
                判断当前集合中是否包含给定的对象。
            public boolean isEmpty()
                判断当前集合是否为空。
            public int size()
                返回集合中元素的个数。
            public Object[] toArray()
                把集合中的元素，存储到数组中。

    Iterator迭代器
        public E next()
            返回迭代的下一个元素。
        public boolean hasNext()
            如果仍有元素可以迭代，则返回 true。

Test2：
    泛型：可以在类或方法中预支地使用未知的类型。
        tips:一般在创建对象时，将未知的类型确定具体的类型。当没有指定泛型时，默认类型为Object类型。
        接口：
            修饰符 interface接口名<代表泛型的变量> { }
        类：
            修饰符 class 类名<代表泛型的变量> { }
        方法：
            修饰符 <代表泛型的变量> 返回值类型 方法名(参数){ }
        泛型通配符：
            当使用泛型类或者接口时，传递的数据中，泛型类型不确定，可以通过通配符<?>表示
            但是一旦使用泛型的通配 符后，只能使用Object类中的共性方法，集合中元素自身方法无法使用。
            public static void getElement(Collection<?> coll){}
        泛型的上限：
            类型名称 <? extends 类 > 对象名称
            只能接收该类型及其子类
        泛型的下限：
            类型名称 <? super 类 > 对象名称
            只能接收该类型及其父类型
    泛型的好处：
        将运行时期的ClassCastException，转移到了编译时期变成了编译失败。
        避免了类型强转的麻烦。
        tips:泛型是数据类型的一部分，我们将类名与泛型合并一起看做数据类型。

    集合遍历：for 循环，增强for 循环，stream 流，迭代器

    Collections.shuffle(list); // 打乱集合的元素

*/
}
