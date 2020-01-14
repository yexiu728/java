package day9.test3;

public class Teacher implements Person  {

    @Override
    public void eat() {
        System.out.println("下课时间，老师在吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("躺到床上，睡一觉啊");

        class Eye{
            public void comfort() {
                System.out.println("睡过觉之后舒服多了");
            }
        }

        new Eye().comfort();

    }

    public class Mouth {
        public void speak() {
            System.out.println("上课时间，老师在讲课");
        }
    }

}
