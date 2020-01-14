package day4;

public class Test0 {
    /*

test1：

    字符串有length 属性，没有length() 方法

    数组越界异常
        ArrayIndexOutOfBoundsException
    空指针异常
        NullPointerException

    反转数组
        public static void reverse(int[] arr) {
            for(int start = 0, end = arr.length - 1; start < end; start++, end--) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

    打印数组
        public static void printArr(int[] arr) {
            System.out.print("[ ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if(i <= arr.length - 2) {
                    System.out.print(", ");
                } else {
                    System.out.print(" ]");
                }
            }
            System.out.println();
        }

Test2：
    类与对象
        类：是一组相关属性和行为的集合，是抽象的
        对象：是一类事物的具体体现，是具体的
            类是对象的模板，对象是类的实体

        定义类：就是定义类的成员，包括成员变量和成员方法。
            public class 类名 {
                //成员变量
                //成员方法
            }
            成员变量：和以前定义变量几乎是一样的。
                只不过位置发生了改变。在类中，方法外。
                String name;
            成员方法：和以前定义方法几乎是一样的。
                只不过把static去掉
                public void study(){
                    System.out.println("学习");
                }

        创建对象
            类名 对象名 = new 类名();

    局部变量和成员变量的区别？
        在类中的位置不同
            成员变量：类中，方法外
            局部变量：方法中或者方法声明上(形式参数)
        作用范围不一样
            成员变量：类中
            局部变量：方法中
        初始化值的不同
            成员变量：有默认值
            局部变量：没有默认值。必须先定义，赋值，最后使用
        在内存中的位置不同
            成员变量：堆内存
            局部变量：栈内存
        生命周期不同
            成员变量：随着对象的创建而存在，随着对象的消失而消失
            局部变量：随着方法的调用而存在，随着方 法的调用完毕而消失

Test4：

    private：私有的

    构造器：无返回值，名称和类名相同
    如果定义了带参数的构造器，则必须定义一个无参的构造器

    封装原则
        将属性隐藏起来，若需要访问某个属性，提供公共方法对其访问

    自动生成构造器和getter、setter 方法
        右键 -> Generate
        或者 Alt + Insert

*/
}
