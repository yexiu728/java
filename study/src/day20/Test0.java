package day20;

public class Test0 {
    /*

Test1：
    JUnit（单元测试）：
        要求方法没有返回值，没有参数

        导包：
            hamcrest-all-1.3.jar
            junit-4.12.jar
        常用注解
            @Before：在每个测试方法之前都会运行一次
            @After：在每个测试方法运行以后运行的方法
            @BeforeClass：在所有的测试方法运行之前，运行一次，而且必须用在静态方法上面。
            @AfterClass：所有的测试方法运行以后，运行一次，必须用在静态方法上面。

Test2：
    反射：
        获取Class对象的三种方式（类）
            方式1：通过类名.class获取
            方式2：通过Object类对象的成员方法getClass()方法获取
            方式3：通过Class.forName("全限定类名")方法获取
        Class对象相关方法
            String getSimpleName()
                获得简单类名，只是类名，没有包
            String getName() ： 获取完整类名，包含包名+类名
            T newInstance() ：创建此 Class 对象所表示的类的一个新实例。要求：类必须有public的无参数构造方法

        获取Class对象的Constructor信息（构造器）
            Constructor getConstructor(Class... parameterTypes)
                根据参数类型获取构造方法对象，只能获得public修饰的构造方法。
                如果不存在对应的构造方法，则会抛出 java.lang.NoSuchMethodException 异常。
            Constructor getDeclaredConstructor(Class... parameterTypes)
                根据参数类型获取构造方法对象，能获取所有的构造方法，包括private修饰的构造方法。
                如果不存在对应的构造方法，则会抛出 java.lang.NoSuchMethodException 异常。
            Constructor[] getConstructors()
                获取所有的public修饰的构造方法
            Constructor[] getDeclaredConstructors()
                获取所有构造方法，包括public、privat、默认、protected修饰的
        Constructor类中常用方法
            T newInstance(Object... initargs)
                根据指定参数创建对象。
            void setAccessible(true)
                暴力反射，除public修饰的构造方法外，其他构造方法反射都需要暴力反射

Test3：
         获取Class对象的Method信息（方法）
             Method getMethod("方法名", 方法的参数类型... 类型)
                根据方法名和参数类型获得一个方法对象，只能是获取public修饰的
            Method getDeclaredMethod("方法名", 方法的参数类型... 类型)
                根据方法名和参数类型获得一个方法对象，包括private修饰的
            Method[] getMethods()
                获取所有的public修饰的成员方法，包括父类中。
            Method[] getDeclaredMethods()
                获取当前类中所有的方法，包含私有的，不包括父类中。
        Method类中常用方法
            Object invoke(Object obj, Object... args)
                根据参数args调用对象obj的该成员方法 如果obj=null，则表示该方法是静态方法
            void setAccessible(boolean flag)
                暴力反射，设置为可以直接调用私有修饰的成员方法

Test4：
        获取Class对象的Field信息（成员变量）
            Field getDeclaredField(String name)
                根据属性名获得属性对象，包括private修饰的
            Field getField(String name)
                根据属性名获得属性对象，只能获取public修饰的
            Field[] getFields()
                获取所有的public修饰的属性对象，返回数组。
            Field[] getDeclaredFields()
                获取所有的属性对象，包括private修饰的，返回数组。
        Field类中常用方法
            void set(Object obj, Object value)
            void setInt(Object obj, int i)
            void setLong(Object obj, long l)
            void setBoolean(Object obj, boolean z)
            void setDouble(Object obj, double d)
            Object get(Object obj)
            int getInt(Object obj)
            long getLong(Object obj)
            boolean getBoolean(Object ob)
            double getDouble(Object obj)
            void setAccessible(true)
                暴力反射，设置为可以直接访问私有类型的属性。
            Class getType(); 获取属性的类型，返回Class对象。

Test5(位置前置)：
        注解解析（Anontation）
            Anontation：所有注解类型的公共接口，类似所有类的父类是Object。
            AnnotatedElement：定义了与注解解析相关的方法，常用方法以下四个
                boolean isAnnotationPresent(Class annotationClass);
                    判断当前对象是否有指定的注解，有则返回 true，否则返回false。
                T getAnnotation(Class<T> annotationClass);
                    获得当前对象上指定的注解对象。
                Annotation[] getAnnotations();
                    获得当前对象及其从父类上继承的所有的注解对象。
                Annotation[] getDeclaredAnnotations();
                    获得当前对象上所有的注解对象，不包括父类的。


Test6：
    注解
        注解相当一种标记，是类的组成部分，可以给类携带一些额外的信息。
        标记(注解)可以加在包，类，字段，方法，方法参数以及局部变量上。
        注解是给编译器或JVM看的，编译器或JVM可以根据注解来完成对应的功能。
    注解的作用
        生成帮助文档：@author和@version
        编译检查：@Override
        框架的配置(框架=代码+配置)
    定义格式
        public @interface 注解名{
            数据类型 属性名();
            数据类型 属性名() default 默认值;
        }
        属性适用的数据类型
            八种基本数据类型（int,float,boolean,byte,double,char,long,short)
            String类型，Class类型，枚举类型，注解类型
            以上所有类型的一维数组
    特殊属性value
        当注解中只有一个属性且名称是value，在使用注解时给value属性赋值可以直接给属性值，
            无论value是单值元素还是数组类型。
        如果注解中除了value属性还有其他属性，且至少有一个属性没有默认值，
            则在使用注解给属性赋值时， value属性名不能省略。

    元注解
        @Target：ElementType
            TYPE： 用在类,接口上
            FIELD：用在成员变量上
            METHOD： 用在方法上
            PARAMETER：用在参数上
            CONSTRUCTOR：用在构造方法上
            LOCAL_VARIABLE：用在局部变量上
            ANNOTATION_TYPE：用在注解上
        @Retention：RetentionPolicy
            SOURCE：注解只存在于Java源代码中，编译生成的字节码文件中就不存在了。
            CLASS：注解存在于Java源代码、编译以后的字节码文件中，运行的时候内存中没有，默认值。
            RUNTIME：注解存在于Java源代码中、编译以后的字节码文件中、运行时内存中，程序可以通过反射获取该注解。

*/
}
