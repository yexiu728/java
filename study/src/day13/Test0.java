package day13;

public class Test0 {
    /*

Test1：
    Map<key, value>：
        public V put(K key, V value) :
            把指定的键与指定的值添加到Map集合中。
        public V remove(Object key)
            把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的 值。
        public V get(Object key)
            根据指定的键，在Map集合中获取对应的值。
        boolean containsKey(Object key)
            判断集合中是否包含指定的键。
        public Set<K> keySet()
            获取Map集合中所有的键，存储到Set集合中。
        public Set<Map.Entry<K,V>> entrySet()
            获取到Map集合中所有的键值对对象的集合(Set集合)。

    HashMap：
        无序，key 和value 可以同时为空null
        key不可重复、key可以为空
        value可以重复、value可以为空
            存储数据采用的哈希表结构，元素的存取顺序不能保证一致。
            由于要保证键的唯一、不重复，需要重写键的hashCode()方法、equals()方法。

    LinkedHashMap：
        有序，key 和value 可以同时为空null
        key不可重复、key可以为空
        value可以重复、value可以为空
            HashMap下有个子类LinkedHashMap，存储数据采用的哈希表结构+链表结构。
            通过链表结构可以保证元素的存取顺序一致；
            通过哈希表结构可以保证的键的唯一、不重复，需要重写键的 hashCode()方法、equals()方法。

    不同集合的区别
        Collection 中的集合，元素是孤立存在的（理解为单身），向集合中存储元素采用一个个元素的方式存储
        Map 中的集合，元素是成对存在的(理解为夫妻)。每个元素由键与值两部分组成，通过键可以找对所对应的值
        Collection 中的集合称为单列集合， Map 中的集合称为双列集合。

        遍历方式：Set、Map.Entry
            增强for
            迭代器
            流与lambda表达式

Test2：纸牌案例

Test4：
    异常：
        异常的根类是 java.lang.Throwable
            其下有两个子类：java.lang.Error 与 java.lang.Exception
            平常所说的异常指 java.lang.Exception
        Throwable中的常用方法：
            public void printStackTrace() :打印异常的详细信息。
                包含了异常的类型,异常的原因,还包括异常出现的位置,
                在开发和调试阶段,都得使用printStackTrace。
            public String getMessage()
                获取发生异常的原因。提示给用户的时候,就提示错误原因。
            public String toString()
                获取异常的类型和异常描述信息(不用)。

        编译时期异常:
            checked异常。在编译时期,就会检查,如果没有处理异常,则编译失败。(如日期格式化异常)
        运行时期异常:
            runtime异常。在运行时期,检查异常.在编译时期,运行异常不会编译器检测(不报错)。(如数学异常)

        声明异常throws
            声明异常：将问题标识出来，报告给调用者。
                如果方法内通过throw抛出了编译时异常，而没有捕获处理，那么必须通过throws进行声明，
                让调用者去处理。
                    修饰符 返回值类型 方法名(参数) throws 异常类名1,异常类名2…{
                        throw new 异常类名1();
                        throw new 异常类名2();
                    }
            捕获异常try…catch
                try{
                    编写可能会出现异常的代码
                }catch(异常类型 e){
                    处理异常的代码 //记录日志/打印异常信息/继续抛出异常
                } finally {
                    不论是否有异常，必须执行的代码（可以没有）
                }

        1. 方法重写，子类只能抛比父类小的异常(父类所抛异常或父类所抛异常的子类)
            a. 重写方法不能抛出与父类平级的其他异常
            b. 重写方法不能抛出比父类高级的异常
            c. 重写方法: 可以抛出和父类同样的异常
            d. 重写方法: 可以抛出父类抛出异常的子类异常
            e. 重写方法: 可以抛出多个 "父类抛出异常的子类异常".
        2. 方法重写，父类没有抛异常，子类重写父类方法也不能抛异常?
            a. 父类不抛出异常,子类也不能抛出异常
            b. 如果子类内部抛出了异常(或调用抛出异常的方法)只能自己处理,不允许向外抛.
        注：这里所说的异常都是编译异常。


    Ctrl + Alt + T 生成捕获异常代码

*/
}
