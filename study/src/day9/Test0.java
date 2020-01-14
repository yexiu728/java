package day9;

public class Test0 {
/*
Test1：
    final： 不可改变。可以用于修饰类、方法和变量。
        类：被修饰的类，不能被继承。
        方法：被修饰的方法，不能被重写。
        变量：被修饰的变量，不能被重新赋值。
            1、局部变量——基本类型
                基本类型的局部变量，被final修饰后，只能赋值一次，不能再更改。
                public static void main(String[] args) {
                    //声明局部变量,使用final修饰
                    final int a; //第一次赋值
                    a=10; //第二次赋值
                    // a=20; //报错,不能重新赋值
                }
            2、局部变量——引用类型
                引用类型的局部变量，被 final 修饰后，只能指向一个对象，地址不能再更改。
                但是不影响对象内部的成员 变 量值的修改
                public static void main(String[] args) {
                    //创建Person对象
                    final Person p=new Person();
                    // p=new Person(); //被final修饰的对象不可指向其他地址值
                    p.setName("张三"); //可以修改此对象的属性值
                }
            3、成员变量
                成员变量涉及到初始化的问题，初始化方式有两种，只能二选一：
                    显示初始化(在定义成员变量的时候立马赋值)
                        public class Student{
                            final int num=10;
                        }
                    构造方法初始化(在构造方法中赋值一次)
                        class Student{
                            final int num=10;
                            final int hw2;
                            public Student (){
                                this.hw2=20; //赋值一次后，不可再次赋值
                                // this.hw2=30;
                            }
                            public Student(int i){
                                //如果有多个构造方法,那么所有的构造方法中必须都得给num2赋值
                                this.hw2=30;
                            }
                        }
Test2：
    权限修饰符 public > protected > 默认 > private
        public：公共的
        protected：受保护的
        default：默认的
        private：私有的
                                                public          protected           default             private
            同一类中                         √                   √                       √                   √
            同一包中(子类或任意类)    √                   √                       √
            不同包的子类                   √                   √
            不同包的任意类                √

Test4：
    内部类
        将一个类A定义在另一个类B里面，里面的那个类A就称为内部类，B则称为外部类
        1. 成员内部内，类定义在了成员位置 (类中方法外称为成员位置)
            内部类可以直接访问外部类的成员，包括私有成员。
            外部类名.内部类名 对象名 = new 外部类型().new 内部类型();
                class 外部类{
                    // 成员变量
                    // 成员方法
                    class 内部类{
                        // 成员变量
                        // 成员方法
                    }
                }

        2. 局部内部类，类定义在方法内
            使用方式: 在定义好局部内部类后,直接就创建对象
            内部类可以直接访问外部类的成员，包括私有成员。
                class 外部类名 {
                    数据类型 变量名;
                    修饰符 返回值类型 方法名(参数列表) {
                        class 内部类 {
                            成员变量
                            成员方法
                        }
                    }
                }
        3. 匿名内部类
            匿名内部类的本质
                1. 定义一个没有名字的内部类
                2. 这个类实现了Swim接口
                3. 创建了这个没有名字的类的对象
            通常在方法的形式参数是接口或者抽象类时，也可以将匿名内部类作为参数传递
            new 父类名或者接口名(){
                // 方法重写
                @Override
                public void method() {
                    // 执行语句
                }
            };

Test4：
    Lambda标准格式
        一些参数
        一个箭头
        一段代码
        Lambda表达式的标准格式为：
            (参数类型 参数名称) -> { 代码语句 }
        小括号内的语法与传统方法参数列表一致：无参数则留空；多个参数则用逗号分隔。
        -> 是新引入的语法格式，代表指向动作。
        大括号内的语法与传统方法体要求基本一致。
    要求接口要只能有一个抽象类

Test5：
    stream 流
        list.stream()：将list 转换成stream
        forEach(n)：遍历
        filter(n)：过滤
        collect(Collect.toList())：转换成List 集合
        concat(a, b)：拼接
            Stream<E> cStream = Stream.concat(aStream, bStream);
        limit(n)：前n 个
        skip(n)：跳过
        count()：统计流中元素个数
        sorted(a, b)：排序
        map：映射

额外作业：
    student(name,age，score)
    List<Student>list=new ArrayList<>();
    List<Student>list2=new ArrayList<>();
    班级a有若干学生
    班级b有若干学生

    1.打印总共有多少姓张的学生的个数
    2.先按年龄降序，再按成绩升序排序
    3.打印2个班级中前3个姓张且年龄小于18岁的学生信息



*/
}

