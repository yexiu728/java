package day13.test2.part2.test1;

public class Father {
    public void eat() throws ToothPainException {
        System.out.println("吃到一个石子");
        throw new ToothPainException("父亲牙疼");
    }

    public void drink() {
        System.out.println("喝什么都没有问题");
    }
}
